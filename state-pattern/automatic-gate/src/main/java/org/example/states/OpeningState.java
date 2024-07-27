package org.example.states;

import org.example.GateController;

public class OpeningState extends GateState {
    public OpeningState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        gateController.getGate().open();
        gateController.getBuzzer().stop();
        GateState state = new OpeningThenStoppedState(gateController);
    }
}
