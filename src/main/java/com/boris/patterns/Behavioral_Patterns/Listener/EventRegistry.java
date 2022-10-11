package com.boris.patterns.Behavioral_Patterns.Listener;

import java.util.LinkedList;
import java.util.List;

public class EventRegistry {

    private LinkedList<Event> eventList;
    private ListenerRegistry listenerRegistry;

    public EventRegistry() {
        eventList = new LinkedList<>();
    }

    public void add(Event event) {
       eventList.add(event);
    }

    public synchronized Event get() {
        return eventList.pollFirst();
    }
}
