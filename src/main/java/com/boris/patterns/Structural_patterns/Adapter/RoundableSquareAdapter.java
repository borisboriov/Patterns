package com.boris.patterns.Structural_patterns.Adapter;

public class RoundableSquareAdapter implements Roundable {

    private Square square;

    @Override
    public double getRadius() {
        return square.getSide() * Math.sqrt(2) / 2;
    }

    public RoundableSquareAdapter(Square square) {
        this.square = square;
    }
}
