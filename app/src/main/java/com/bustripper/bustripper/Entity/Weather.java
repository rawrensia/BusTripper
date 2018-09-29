package com.bustripper.bustripper.Entity;

/**
 * Created by User on 3/29/2018.
 *
 * This class implements the Weather entity with the attributes condition, temperature, humidity and windSpeed.
 * It only has getters.
 * @author Turing
 */

public class Weather implements IEntity {

    private String condition, temperature, humidity, windSpeed;

    /**
     * Get method for condition
     * @return the weather conditions
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Get method for temperature
     * @return the temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Get method for humidity
     * @return the humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * Get method for windSpeed
     * @return the wind speed
     */
    public String getWindSpeed() {
        return windSpeed;
    }

}
