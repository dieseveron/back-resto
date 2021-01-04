package com.ar.app.scan.menu.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MenuRestoResponse {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

}
