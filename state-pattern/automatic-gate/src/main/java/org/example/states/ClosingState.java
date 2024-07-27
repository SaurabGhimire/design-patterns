package org.example.states;

import org.example.Gate;
import org.example.GateController;

public class ClosingState extends GateState {
    public ClosingState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        gateController.getGate().open();
        gateController.getBuzzer().stop();
        GateState state = new ClosingThenStoppedState(gateController);
        gateController.setGateState(state);
    }
}
