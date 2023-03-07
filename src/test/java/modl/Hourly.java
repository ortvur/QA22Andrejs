package modl;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Hourly {
    private long dt;
    private double temp;
   @JsonProperty("feels_like")
    private double feelsLike;
    private int pressure;
    private  int humidity;
    private double dew_point;
    private double uvi;
    private int clouds;
    private long visibility;
    @JsonProperty("wind_spedd")
    private double windSpeed;
    private int wind_deg;

}
