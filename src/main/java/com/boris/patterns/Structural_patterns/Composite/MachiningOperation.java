package com.boris.patterns.Structural_patterns.Composite;

public class MachiningOperation implements Operation
{
    private String name;
    public MachiningOperation(String name)
    {
        this.name = name;
    }
    @Override
    public void perform()
    {
        System.out.println(name);
    }
    @Override
    public String getExplanation() {
        return name;
    }
}