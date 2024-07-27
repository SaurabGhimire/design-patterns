package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Gate implements PropertyChangeListener {
    GateState state;

    public Gate(){
        state = GateState.closed;
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
        state = (GateState) evt.getNewValue();
    }
}
