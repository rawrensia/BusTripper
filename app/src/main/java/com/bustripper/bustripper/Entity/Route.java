package com.bustripper.bustripper.Entity;

import java.util.ArrayList;

/**
 * Created by User on 3/29/2018.
 *
 * This class implements the Route entity with the attributes travelTime, startingLocation, destination,
 * startBusStop, destinationBusStop, busServiceInvolved, listOfArrivingBuses and destinationWeather.
 * It also provides a list of arriving buses.
 * @author Turing
 */

public class Route implements IEntity {

    private int travelTime;
    private Location startingLocation, destination;
    private BusStop startBusStop, destinationBusStop;
    private Weather destinationWeather;
    private ArrayList<String> busServiceInvolved;
    private ArrayList<Bus> listOfArrivingBuses;

    /**
     * Get method for travelTime
     * @return amount of time required for travelling the route
     */
    public int getTravelTime() {
        return travelTime;
    }

    /**
     * Get method for startingLocation
     * @return the location which user chooses to start their journey
     */
    public Location getStartingLocation() {
        return startingLocation;
    }

    /**
     * Get method for destination
     * @return the location which user chooses to end their journey
     */
    public Location getDestination() {
        return destination;
    }

    /**
     * Get method for startBusStop
     * @return the first bus stop which the user waits for a bus in the bus route
     */
    public BusStop getStartBusStop() {
        return startBusStop;
    }

    /**
     * Get method for destinationBusStop
     * @return the last bus stop which the user alights the current bus in the bus route
     */
    public BusStop getDestinationBusStop() {
        return destinationBusStop;
    }

    /**
     * Get method for destinationWeather
     * @return forecasted information including weather, temperature, humidity and wind speed of the destination
     */
    public Weather getDestinationWeather() {
        return destinationWeather;
    }

    /**
     * Get method for busServiceInvolved
     * @return a list of bus services that are involved in the bus route
     */
    public ArrayList<String> getBusServiceInvolved() {
        return busServiceInvolved;
    }

    /**
     * Get method for listOfArrivingBuses
     * @return a list of arriving buses
     */
    public ArrayList<Bus> getListOfArrivingBuses() {
        return listOfArrivingBuses;
    }

}
