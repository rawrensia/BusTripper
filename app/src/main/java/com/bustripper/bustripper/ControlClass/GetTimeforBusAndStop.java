package com.bustripper.bustripper.ControlClass;
import android.content.Context;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;


public class GetTimeforBusAndStop {

    private final String busNo, stopNo;
    private Context context;
    static String stop_name;

    public GetTimeforBusAndStop(String stopNo, String busNo,String stopName) {
        super();
        this.busNo = busNo;
        this.stopNo = stopNo;
        stop_name=stopName;
        //this.main();
    }

    public BusTimes main() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        // These two need to be declared outside the try/catch
        // so that they can be closed in the finally block.
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        // Will contain the raw JSON response as a string.
        String BusTimesJsonStr = null;

        try {

            URL url = new URL("http://datamall2.mytransport.sg/ltaodataservice/BusArrivalv2?BusStopCode=" + this.stopNo +"&ServiceNo=" + this.busNo);

            // Create the request and open the connection
            urlConnection = (HttpURLConnection) url.openConnection();
//            urlConnection.setReadTimeout(10000 /* milliseconds */);
//            urlConnection.setConnectTimeout(15000 /* milliseconds */);
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("AccountKey","QOuhOOUltXtFKtlHrRpD8A==");
            urlConnection.setRequestProperty("UniqueUserID", "5cfedab3-e6f2-4ea7-b016-2e658ae60ca8");
            urlConnection.setRequestProperty("accept", "application/json");
            urlConnection.connect();

            // Read the input stream into a String
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null) {
                // Nothing to do.
                BusTimesJsonStr = null;
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            if (buffer.length() == 0) {
                BusTimesJsonStr = null;
            }
            BusTimesJsonStr = buffer.toString();
        } catch (Exception e){
            Log.e("PlaceholderFragment", "Error ", e);
            BusTimesJsonStr = null;
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e("PlaceholderFragment", "Error closing stream", e);
                }
            }
        }

        BusTimes bTimes = null;
        try {
            JSONObject stopJSON = new JSONObject(BusTimesJsonStr);
            bTimes = getBusTimes(stopJSON, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bTimes;


    }
    public BusTimes getBusTimes(JSONObject myJSON, int pos){
        BusTimes bt;
        String no = stop_name;
        int t1=-1,t2=-1, t3=-1;
        try{
            JSONObject bus = myJSON.getJSONArray("Services").getJSONObject(pos);
            no = bus.getString("ServiceNo");

            String time1 = bus.getJSONObject("NextBus").getString("EstimatedArrival");
            if(time1.equals("")){
                bt = new BusTimes(stop_name, -1, -1, -1);
                return  bt;
            }
            t1 = getTimeFromString(time1);

            String time2 = bus.getJSONObject("NextBus2").getString("EstimatedArrival");
            if(time2.equals("")){
                bt = new BusTimes(stop_name, t1 , -1, -1);
                return bt;
            }
            t2 = getTimeFromString(time2);

            String time3 = bus.getJSONObject("NextBus3").getString("EstimatedArrival");
            if(time3.equals("")){
                bt = new BusTimes(stop_name, t1, t2, -1);
                return bt;
            }
            t3 = getTimeFromString(time3);

        }catch (Exception e){
            e.printStackTrace();
        }
        return new BusTimes(stop_name, t1, t2, t3);
    }

    public int getTimeFromString(String time){
        Calendar cal = Calendar.getInstance();
        //int hour = Integer.parseInt(time.substring(11,13))-cal.get(Calendar.HOUR_OF_DAY);
        //int offset = hour>0?hour*60:0;
        int minute = Integer.parseInt(time.substring(14,16))-cal.get(Calendar.MINUTE);
        int second = Integer.parseInt(time.substring(17,19))-cal.get(Calendar.SECOND);
        if(second<0){minute--;}
        return  minute;
    }


}