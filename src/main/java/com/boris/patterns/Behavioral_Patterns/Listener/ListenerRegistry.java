package com.boris.patterns.Behavioral_Patterns.Listener;

import java.util.ArrayList;
import java.util.List;

public class ListenerRegistry {

    private List<Listener> listeners;

    public ListenerRegistry() {

        listeners = new ArrayList<>();
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void broadcast(Event event){
        listeners.forEach(l -> l.doAction(event));
    }

}
