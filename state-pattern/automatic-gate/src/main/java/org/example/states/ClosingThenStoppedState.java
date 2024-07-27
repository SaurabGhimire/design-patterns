package org.example.states;

import org.example.GateController;

public class ClosingThenStoppedState extends GateState{
    public ClosingThenStoppedState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        gateController.getGate().close();
        gateController.getBuzzer().start();
        GateState state = new ClosingState(gateController);
        gateController.setGateState(state);
    }
}
