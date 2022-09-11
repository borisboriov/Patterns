package com.boris.patterns.Structural_patterns.Bridge;

public abstract class AbstractSensor {

    SensorImpl implementor;

    public AbstractSensor(SensorImpl implementor) {
        this.implementor = implementor;
    }
}
