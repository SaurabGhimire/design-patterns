package org.example.states;

import org.example.GateController;

public class OpenState extends GateState{
    public OpenState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        GateState closing = new ClosingState(gateController);
        gateController.setGateState(closing);
    }
}
