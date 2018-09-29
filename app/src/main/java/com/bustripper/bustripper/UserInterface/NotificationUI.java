package com.bustripper.bustripper.UserInterface;

/**
 * Created by User on 4/2/2018.
 *
 * This class is the user interface for notifications. It displays the updates for time-triggered and
 * distance-triggered notifications.
 * @author Turing
 */

public class NotificationUI {
	private String username;

    /**
     * Notifies the user that the arriving bus is a set time away from the starting bus stop.
     * @param time time that was set by user in the settings tab. By default it is 5 minutes.
     */
    public void updateTime(String time) {}

    /**
     * Notifies the user that the he or she is a set distance away from the ending bus stop.
     * @param distance distance that was set by user in the settings tab. By default it is 500 meters..
     */
    public void updateDistance(String distance) {}

}
