package com.boris.patterns.Structural_patterns.Bridge;

public class Accelerometer implements SensorImpl {
    @Override
    public double getValue() {
        return 1 / Math.random();
    }
}