package com.boris.patterns.creationPatterns.experimentFactory;

public class SimulationExecutor extends ExperimentExecutor{

    public SimulationExecutor(SimulationRunConfiguration runConfiguration) {
        super(runConfiguration);
    }

    public SimulationRunConfiguration getConfiguration(){
        return (SimulationRunConfiguration) runConfiguration;
    }

    @Override
    public void execute() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void interrupt() {

    }

    @Override
    public void continueProcess() {

    }

    @Override
    public void stop() {

    }
}
