package com.bustripper.bustripper.UserInterface;

import com.bustripper.bustripper.Entity.BusStop;

import java.util.ArrayList;

/**
 * Created by User on 3/29/2018.
 *
 * This class implements the LTA Data Mall API Boundary
 * which contains of all the methods for API connection
 *
 * @author Turing
 */
public class LTADataMallAPIBoundary {

    /**
     * This method gets possible suggested Bus Service from the API
     *
     * @param keyword
     * @return
     */
    public ArrayList<String> getBusServiceSuggestion(String keyword){return new ArrayList<String>();}

    /**
     * This method gets Bus Service Information from the API
     *
     * @param busServiceNumber
     * @return
     */
    public ArrayList<String> getBusServiceInfo(String busServiceNumber){return new ArrayList<String>();}

    /**
     * This method gets Nearby Bus Stops from the API
     *
     * @param currentLocation
     * @return
     */
    public ArrayList<String> retrieveNearbyBusStops(ArrayList<String> currentLocation){return new ArrayList<String>();}

    /**
     * This method gets the Bus Type of the arriving bus from the API
     *
     * @param startBusStop
     * @param serviceNo
     * @return
     */
    public String getBusType(BusStop startBusStop, String serviceNo){return new String();}

    /**
     * This method gets the Bus Type of the next arriving bus from the API
     *
     * @param startBusStop
     * @param serviceNo
     * @return
     */
    public String getNextArrival(BusStop startBusStop, String serviceNo){return new String();}
}
