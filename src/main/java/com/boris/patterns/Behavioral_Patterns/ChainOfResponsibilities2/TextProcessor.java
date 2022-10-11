package com.boris.patterns.Behavioral_Patterns.ChainOfResponsibilities2;

import java.util.ArrayList;
import java.util.List;

public class TextProcessor {

    private List<Filter> filterChain;

    public TextProcessor() {
        this.filterChain = new ArrayList<>();
    }

    public TextProcessor addFilter(Filter filter) {
        filterChain.add(filter);
        return this;
    }

    public String process(String text) {
        String result = text;
        for (Filter filter : filterChain) {
            result = filter.filter(result);
        }
        return result;
    }

}
