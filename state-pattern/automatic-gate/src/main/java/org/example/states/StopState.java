package org.example.states;

import org.example.GateController;

public class StopState extends GateState {
    GateState pausedState;

    public StopState(GateController gateController, GateState pausedState){
        super(gateController);
        this.pausedState = pausedState;
    }
    @Override
    public void buttonPressed() {
        gateController.setGateState(pausedState);
    }
}
