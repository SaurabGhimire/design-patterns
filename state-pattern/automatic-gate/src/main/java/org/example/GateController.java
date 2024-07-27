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
        support = new PropertyChangeSupport(this);
        gateState = new ClosedState(this);
        gate = new Gate();
        buzzer = new Buzzer();
        flasher = new LightFlasher();
    }

    public void pressButton(){
        gateState.buttonPressed();
    }

    public void sensorOpenSignal(){
        gateState.gateOpenSignal();
    }

    public void sensorClosedSignal(){
        gateState.gateCloseSignal();
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
        support.firePropertyChange("state-change", this.gateState, gateState);
        this.gateState = gateState;
    }

    public void addListener(PropertyChangeListener pcl){
        support.addPropertyChangeListener(pcl);
    }
}
