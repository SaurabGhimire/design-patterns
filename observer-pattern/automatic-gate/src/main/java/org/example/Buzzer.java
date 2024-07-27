package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Buzzer implements PropertyChangeListener {
    public void start(){
        System.out.println("Buzzing.....");
    }

    public void stop(){
        System.out.println("STOPPED Buzzing!!");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState state = (GateState)evt.getNewValue();
        switch (state){
            case opening, closing:
                start();
                break;
            default:
                stop();
        }
    }
}
