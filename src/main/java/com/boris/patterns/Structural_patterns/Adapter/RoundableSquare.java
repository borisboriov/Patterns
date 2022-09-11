package com.boris.patterns.Structural_patterns.Adapter;

public class RoundableSquare extends Square implements Roundable {

    public RoundableSquare(int side) {
        super(side);
    }

    @Override
    public double getRadius() {
        return getSide() * Math.sqrt(2) / 2;
    }
}
