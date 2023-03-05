package modl;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
    private double lat;
    private double lon;
    private  String timezone;

    @JsonProperty("timezone_offset")
    private int timezoneOffset;

    private Current current;

    private List<Minute> minutely;

    private List<Weather> weather;

    private Hourly hourly;
    private double pop;

    @JsonProperty("feels_like")
    private FeelsLike feelsLike;

    private Daily daily;

    private List<Temp> temps;

    private Alerts alerts;



}
