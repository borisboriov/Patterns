package com.boris.patterns.Behavioral_Patterns.Listener;

import java.util.Scanner;

public class ListenerApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        EventRegistry eventRegistry = new EventRegistry();
        ListenerRegistry listenerRegistry = new ListenerRegistry();

        listenerRegistry.addListener(e -> {
            try {
                Thread.sleep((long) (Math.random() * 3000));
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Source 1 receive event: " + e);
        });
        listenerRegistry.addListener(e -> {
            try {
                Thread.sleep((long) (Math.random() * 3000));
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Source 2 receive event: " + e);
        });

        listenerRegistry.addListener(e -> {
            try {
                Thread.sleep((long) (Math.random() * 3000));
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Source 3 receive event: " + e);
        });


        EventLoop loop = new EventLoop(eventRegistry, listenerRegistry);
        loop.start();

        System.out.println("Hello");
        do {
            System.out.println("Input event name & value ");
            String name = in.next();
//            System.out.println("Input event name");
            String value = in.next();

            Event event = new Event(name, value);
            eventRegistry.add(event);
        } while (in.hasNext());

    }
}
