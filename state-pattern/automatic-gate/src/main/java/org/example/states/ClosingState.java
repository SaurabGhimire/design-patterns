package org.example.states;

import org.example.Gate;
import org.example.GateController;

public class ClosingState extends GateState {
    public ClosingState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        GateState state = new StopState(gateController, this);
        gateController.setGateState(state);
    }

    @Override
    public void gateCloseSignal(){
        GateState state = new ClosedState(gateController);
        gateController.setGateState(state);
    }
}
