package modl;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Daily {
    private long dt;
    private long sunrise;
    private long sunset;
    private long moonrise;
    @JsonProperty("moon_phase")
    private double moonPhase;

}
