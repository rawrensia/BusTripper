package com.bustripper.bustripper.Entity;

import java.util.ArrayList;

/**
 * Created by User on 3/29/2018.
 *
 * This class implements the BusStop entity with the attributes busStopName and busStopNumber.
 * It also provides a list of bus services that stops there and their arrival times.
 * @author Turing
 */

public class BusStop implements IEntity {

    private String busStopName, busStopNumber;
    private ArrayList<String> busServiceStringList;
    private ArrayList<Integer> arrivalTimesOfBusServices;
    private ArrayList<Bus> listOfArrivingBuses;
    private int arrTimeOfOneBS;

    /**
     * The BusStop constructor
     * @param bsName The bus stop number
     * @param bsNum The bus stop number
     */
    public BusStop(String bsName, String bsNum) {
        busStopName = bsName;
        busStopNumber = bsNum;
    }

    /**
     * Get method for busStopName
     * @return name of the bus stop
     */
    public String getBusStopName() {
        return busStopName;
    }

    /**
     * Get method for busStopNumber
     * @return bus stop number
     */
    public String getBusStopNumber() {
        return busStopNumber;
    }

    /**
     * Get method for BusServiceStringList
     * @return list of bus services that stops at the bus stop
     */
    public ArrayList<String> getBusServiceStringList() {
        return busServiceStringList;
    }

    /**
     * Get method for arrivalTimesOfBusServices
     * @return list of arrival times of the bus services that stops at the bus stop, limited to 3
     */
    public ArrayList<Integer> getArrivalTimesOfBusServices() {
        return arrivalTimesOfBusServices;
    }

    /**
     * Get method for listOfArrivingBuses
     * @return list of buses arriving at that bus stop
     */
    public ArrayList<Bus> getListOfArrivingBuses() {
        return listOfArrivingBuses;
    }

    /**
     * Get method for arrTimeOfOneBS
     * @return arrival times of one bus stop
     */
    private int getarrTimeOfOneBS() { return arrTimeOfOneBS; }

}
