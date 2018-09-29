package com.bustripper.bustripper.UserInterface;

import com.bustripper.bustripper.Entity.Location;

/**
 * This Class implements the RouteUI User Interface
 * RouteUI interacts with the User for the purpose of setting a Route.

 */
public class RouteUI {


    /**
     * Display the Route UI
     *
     * @param userName The User Name of the User.
     */
    public void showRouteUI(String userName){}


    /**
     * Show a List of Routes that starts from startLocation and ends at destination
     *
     * @param startLocation The Starting Location that is selected by the User.
     * @param destination The Destination that is selected by the User.
     */
    public void showPosRoute(Location startLocation, Location destination){}


    /**
     * Show a details of a particular Route
     *
     * @param routeID The ID of the Route selected by the User.
     *
     */
    public void showRouteDetails(String routeID){}

    /**
     * Interact with User to select a particular Route
     *
     * @param routeID The ID of the Route selected by the User.
     * @param userName The User Name of the User.
     *
     */
    public void selectBusRoute(String routeID, String userName){}

    /**
     * Show the general information of the Weather at the Destination selected by the User
     *
     */
    public void showWeatherInfo(){}


    /**
     * Show more specific information of the Weather at the Destination selected by the User
     *
     */
    public void showAdditionalWeatherInfo(){}

}
