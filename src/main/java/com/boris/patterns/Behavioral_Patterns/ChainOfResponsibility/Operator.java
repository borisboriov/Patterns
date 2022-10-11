//package com.boris.patterns.Behavioral_Patterns.ChainOfResponsibility;
//
//public class Operator extends Handler {
//    @Override
//    public void handle(Request request) {
//        if(isBusy()) {
//            System.out.printf("Оператор %s занят\n", name);
//            super.handle(request);
//        }
//        else {
//            System.out.printf("Оператор %s обрабатывает Request %s\n",
//                    name, request.getData());
//        }
//    }
//    private boolean isBusy() {
//        return Math.random() < probability;
//    }
//    // вероятность занятости оператора
//    private final double probability = 0.9;
//// ...
//}