package org.example.states;

import org.example.GateController;

public abstract class GateState {
    GateController gateController;

    public GateState(GateController gateController){
        this.gateController = gateController;
    }
    public abstract void buttonPressed();
}
