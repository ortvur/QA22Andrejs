package modl;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Alerts {
    @JsonProperty("sender_name")
    private String senderName;
    private String event;
    private Long start;
    private Long end;
    private String description;
}
