//package com.boris.patterns.Behavioral_Patterns.Strategy;
//
//import com.boris.patterns.Structural_patterns.Proxy.Money;
//
//public class Order {
//
//    public void pay(PaymentStrategy strategy) {
//        Money total = getTotal();
//        strategy.pay(total);
//    }
//    public Money getTotal() {
//        return (Money) Math.random() * 3000;
//    }
//}