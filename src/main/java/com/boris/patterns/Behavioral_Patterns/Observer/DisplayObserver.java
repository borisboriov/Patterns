package com.boris.patterns.Behavioral_Patterns.Observer;

public class DisplayObserver implements Observer {
    @Override
    public void update(Subject subject, Object arg) {
        System.out.printf("%s temperature %s\n", subject.toString(), arg);
    }
}