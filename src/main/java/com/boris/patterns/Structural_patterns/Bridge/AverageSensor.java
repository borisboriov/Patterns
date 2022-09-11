package com.boris.patterns.Structural_patterns.Bridge;

import java.util.Deque;
import java.util.LinkedList;

public class AverageSensor extends AbstractSensor {

    private final Deque<Double> queue = new LinkedList<>();
    private final int n;

    public AverageSensor(SensorImpl implementor, int n) {
        super(implementor);
        this.n = n;
    }

    // среднее по последним N измерениям
    public double getAverageValue() {
        queue.add(implementor.getValue());
        if (queue.size() > n)
            queue.remove();
        return queue.stream().mapToDouble(a -> a).average().orElse(0);

    }
}
