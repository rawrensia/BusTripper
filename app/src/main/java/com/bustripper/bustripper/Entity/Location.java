package com.bustripper.bustripper.Entity;

import java.util.ArrayList;

/**
 * Created by User on 3/29/2018.
 *
 * This class implements the Location entity with the attributes locationName and locationCoordinates.
 * It only has getters.
 * @author Turing
 */

public class Location implements IEntity {

    private String locationName;
    private ArrayList<Double> locationCoordinates;

    /**
     * Get method for locationName
     * @return name of the location
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Get method for locationCoordinate
     * @return a pair of coordinates of the location, in 5 decimal places
     */
    public ArrayList<Double> getLocationCoordinates() {
        return locationCoordinates;
    }

}
