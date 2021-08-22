package com.example.cryptokrypto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record WeatherDto(Long id,
                         @JsonProperty("moje_miasto") String myCity,
                         @JsonProperty ("temp_w_cs")  Long tempInCelsius) {
}
