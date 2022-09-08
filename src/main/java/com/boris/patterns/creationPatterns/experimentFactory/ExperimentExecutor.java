package com.boris.patterns.creationPatterns.experimentFactory;

public abstract class ExperimentExecutor implements IExecutor {

    protected RunConfiguration runConfiguration;

    public ExperimentExecutor(RunConfiguration runConfiguration) {
        this.runConfiguration = runConfiguration;
    }


}
