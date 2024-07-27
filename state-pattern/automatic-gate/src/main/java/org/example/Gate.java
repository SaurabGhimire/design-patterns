package org.example;

import org.example.states.GateState;
import org.example.states.OpenState;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Gate implements PropertyChangeListener {

    public Gate(){
    }
    public void open(){
        System.out.println("Gate is opening...");
    }

    public void close(){
        System.out.println("Gate is closing...");
    }

    public void stop(String message){
        System.out.println(message);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState state = (GateState)evt.getNewValue();
        switch (state.getClass().getSimpleName()) {
            case "OpeningState" -> open();
            case "ClosingState" -> close();
            case "OpenState" -> stop("Open");
            case "ClosedState" -> stop("Close");
            case "StopState" -> stop("Stop");
        }
    }
}
