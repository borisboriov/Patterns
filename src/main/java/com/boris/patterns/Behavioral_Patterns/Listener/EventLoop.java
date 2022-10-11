package com.boris.patterns.Behavioral_Patterns.Listener;

import lombok.SneakyThrows;

import java.util.concurrent.ThreadFactory;

public class EventLoop {

    private boolean running;
    private ThreadFactory factory;
    private Thread eventsThread;

    private EventRegistry eventRegistry;

    private ListenerRegistry listenerRegistry;

    public EventLoop(EventRegistry eventRegistry, ListenerRegistry listenerRegistry) {
        this.eventRegistry = eventRegistry;
        this.listenerRegistry = listenerRegistry;
        running = true;
        factory = r -> {
            Thread thread = new Thread(r);
            thread.setName("event-loop-thread");
            thread.setDaemon(true);
            return thread;
        };
        eventsThread = factory.newThread(this::run);
    }

    @SneakyThrows
    private void run() {
        while (running){
            Event event = eventRegistry.get();
            if (event != null){
                System.err.println("Loop take: " + event);
                listenerRegistry.broadcast(event);
            }
            Thread.sleep(300);
        }
    }


    public void start() {
        eventsThread.start();
    }

}
