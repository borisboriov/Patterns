package com.boris.patterns.creationPatterns.experimentFactory;

import org.springframework.stereotype.Component;

@Component
public class ExecutorFactory {

    public IExecutor createGfaExecutor(GfaRunConfiguration configuration) {
        return new GfaExecutor(configuration);
    }

    public IExecutor createGfaExecutor(SimulationRunConfiguration configuration) {
        return new SimulationExecutor(configuration);
    }

}
