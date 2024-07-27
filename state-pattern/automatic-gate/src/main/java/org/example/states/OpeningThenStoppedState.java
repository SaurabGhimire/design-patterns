package org.example.states;

import org.example.Gate;
import org.example.GateController;

public class OpeningThenStoppedState extends GateState {
    public OpeningThenStoppedState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        gateController.getGate().close();
        gateController.getBuzzer().stop();
        GateState state = new OpeningState(gateController);
    }
}
