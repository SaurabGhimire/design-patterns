package org.example;

import org.example.states.ClosedState;
import org.example.states.GateState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class GateController {
    private PropertyChangeSupport support;
    private Gate gate;
    GateState gateState;
    Buzzer buzzer ;
    LightFlasher flasher;

    public GateController(){
        gateState = new ClosedState(this);
        gate = new Gate();
        buzzer = new Buzzer();
        flasher = new LightFlasher();
    }

    public void pressButton(){
        gateState.buttonPressed();
    }

    public void sensorOpenSignal(){
        gate.stop("Open");
    }

    public void sensorClosedSignal(){
        gate.stop("Closed");
    }

    public Gate getGate() {
        return gate;
    }

    public Buzzer getBuzzer() {
        return buzzer;
    }

    public LightFlasher getFlasher() {
        return flasher;
    }

    public void setGateState(GateState gateState) {
        this.gateState = gateState;
    }
}
