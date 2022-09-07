package com.boris.patterns.creationPatterns.FabricaGeometri;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
