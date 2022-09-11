package com.boris.patterns.Structural_patterns.Adapter;

public class Circle implements Roundable {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
