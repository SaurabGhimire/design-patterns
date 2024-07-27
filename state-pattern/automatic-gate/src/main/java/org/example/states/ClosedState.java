package org.example.states;

import org.example.GateController;

public class ClosedState extends GateState{
    public ClosedState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        gateController.getGate().open();
        gateController.getBuzzer().start();
        GateState state = new OpeningState(gateController);
        gateController.setGateState(state);
    }
}
