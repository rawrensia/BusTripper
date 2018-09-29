package com.bustripper.bustripper.Entity;

/**
 * Created by User on 3/29/2018.
 *
 * This class implements the Bus entity with the attributes title
 *
 * @author Turing
 */
public class Bus implements IEntity {
    private String busIndex;
    private boolean wheelchairAccessibility;

    /**
     * Constructor for Bus
     *
     * @param busIndex
     * @param wheelchairAccessibility
     */
    public Bus(String busIndex, boolean wheelchairAccessibility) {
        this.busIndex = busIndex;
        this.wheelchairAccessibility = wheelchairAccessibility;
    }

    /**
     * Get Method for Bus Index
     *
     * @return
     */
    public String getBusIndex() {
        return busIndex;
    }

    /**
     * Set Method for Bus Index
     * @param busIndex
     */
    public void setBusIndex(String busIndex) {
        this.busIndex = busIndex;
    }

    /**
     * Get Method for wheelchairAccessibility
     * @return
     */
    public boolean isWheelchairAccessibility() {
        return wheelchairAccessibility;
    }

    /**
     * Set Method for wheelchairAccessibility
     * @param wheelchairAccessibility
     */
    public void setWheelchairAccessibility(boolean wheelchairAccessibility) {
        this.wheelchairAccessibility = wheelchairAccessibility;
    }
}
