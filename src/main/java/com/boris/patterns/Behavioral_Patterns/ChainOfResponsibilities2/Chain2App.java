package com.boris.patterns.Behavioral_Patterns.ChainOfResponsibilities2;

public class Chain2App {

    public static void main(String[] args) {

        TextProcessor processor = new TextProcessor();

        String result = processor.addFilter(f -> f.replaceAll("[\\d]", ""))
                .addFilter(f -> f.replaceAll("\\W", "  "))
                .addFilter(f -> f.replaceAll(" {2}", " "))
                .addFilter(String::toLowerCase)
                .process("SomE TeXt, with nuMbErs 12312321, finish");

        System.out.println(result);
    }

}
