package org.example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class GateController {
    private PropertyChangeSupport support;
    private Gate gate;


    public GateController(){
        support = new PropertyChangeSupport(this);
        gate = new Gate();
        addPropertyChangeListener(gate);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl){
        support.addPropertyChangeListener(pcl);
    }

    public void pressButton(){
        switch (gate.state) {
            case open, opening:
                gate.close();
                support.firePropertyChange("motion", gate.state, GateState.closing);
                break;
            case closed, closing:
                gate.open();
                support.firePropertyChange("motion", gate.state, GateState.opening);
                break;
            default:
        }

    }

    public void sensorOpenSignal(){
        gate.stop("Open");
        support.firePropertyChange("stop", gate.state,GateState.open );
    }

    public void sensorClosedSignal(){
        gate.stop("Closed");
        support.firePropertyChange("stop", gate.state,GateState.closed );
    }
}
