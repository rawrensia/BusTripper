package com.bustripper.bustripper.UserInterface;

import com.bustripper.bustripper.Entity.Weather;

/**
 * Created by User on 3/29/2018.
 *
 * This class is the boundary class for the NEA Weather Forecast API.
 * It only has getters.
 * All information are provided by the API.
 * @author Turing
 */

public class NEA2hourWeatherForecastAPIBoundary {

    private Weather wInfo, addWInfo;

    /**
     * Get method for wInfo
     * @return basic weather information
     */
    public Weather getwInfo() {
        return wInfo;
    }

    /**
     * Get method for addWInfo
     * @return additional weather information
     */
    public Weather getAddWInfo() {
        return addWInfo;
    }

}
