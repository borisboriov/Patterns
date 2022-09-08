package com.boris.patterns.creationPatterns.experimentFactory;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SimulationRunConfiguration implements RunConfiguration {

    private Long id;
    private double speed;
    private LocalDateTime localDateTime;

    public long getId(){
        return id;
    }

}
