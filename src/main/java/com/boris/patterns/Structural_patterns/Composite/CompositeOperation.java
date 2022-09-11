package com.boris.patterns.Structural_patterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.tomcat.util.buf.StringUtils.join;

public class CompositeOperation implements Operation {
    private List<Operation> operations = new ArrayList<>();
    @Override
    public void perform() {
        System.out.printf("performing %s \n{\n",this.getClass().getSimpleName());
        for (Operation operation : operations) {
            operation.perform();
        }
        System.out.printf("}");
    }
    @Override
    public String getExplanation() {
        List<String> strings = new ArrayList<>();
        for (Operation operation : operations) {
            strings.add(operation.getExplanation());
        }
        return "[" + join(strings) + "]";
    }
    public Operation add(Operation... operations) {
        this.operations.addAll(Arrays.asList(operations));
        return this;
    }
}