package com.element.webflux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WeatherEvent {

    private Weather weather;
    private LocalDateTime date;

}
