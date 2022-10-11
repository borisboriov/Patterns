package com.boris.patterns.Behavioral_Patterns.Observer;

public class Sensor extends Subject {
    private int t;
    public int getT() {
        return t;
    }
    public void setT(int t) {
        this.t = t;
        notify(t);
    }
}