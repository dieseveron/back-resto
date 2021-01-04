package com.ar.app.scan.menu.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MenuRestoRequest {

    @JsonProperty("IdResto")
    private int idResto;

}
