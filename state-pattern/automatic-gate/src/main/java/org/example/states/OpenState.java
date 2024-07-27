package org.example.states;

import org.example.GateController;

public class OpenState extends GateState{
    public OpenState(GateController gateController){
        super(gateController);
    }
    @Override
    public void buttonPressed() {
        gateController.getGate().close();
        gateController.getBuzzer().stop();
        GateState closing = new ClosingState(gateController);
    }
}
