package com.boris.patterns.Structural_patterns.Bridge;

public class Speedometer implements SensorImpl {

    @Override
    public double getValue() {
        return Math.random();
    }
}
