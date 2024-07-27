package org.example.states;

import org.example.GateController;

public class OpeningState extends GateState {
    public OpeningState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        GateState state = new StopState(gateController, this    );
        gateController.setGateState(state);
    }

    @Override
    public void gateOpenSignal(){
        GateState state = new OpenState(gateController);
        gateController.setGateState(state);
    }
}
