package com.boris.patterns.creationPatterns.experimentFactory;

import lombok.Data;

@Data
public class GfaRunConfiguration implements RunConfiguration {

    private Long id;
    private double min;
    private double max;

    public long getId() {
        return id;
    }
}