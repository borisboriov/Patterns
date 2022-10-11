package com.boris.patterns.Behavioral_Patterns.ChainOfResponsibilities2;

public class TestClass {

    int field;
    String string;


    public TestClass(int field, String string) {
        this.field = field;
        this.string = string;
    }

    public TestClass test() {
        return this;
    }


    @Override
    public String toString() {
        return "TestClass{" +
                "field=" + field +
                ", string='" + string + '\'' +
                '}';
    }
}
