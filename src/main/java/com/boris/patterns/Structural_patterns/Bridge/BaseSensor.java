package com.boris.patterns.Structural_patterns.Bridge;

public class BaseSensor extends AbstractSensor {

    public BaseSensor(SensorImpl implementor) {
        super(implementor);
    }

    public double getValue() {
        return implementor.getValue();
    }
}
