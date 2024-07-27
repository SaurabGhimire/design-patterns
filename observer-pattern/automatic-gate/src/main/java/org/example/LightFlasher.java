package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LightFlasher implements PropertyChangeListener {

    public void flashRedColor(){
        System.out.println("Flashing RED.");
    }

    public void flashOrangeColor(){
        System.out.println("Flashing ORANGE.");
    }

    public void stopFlash(){
        System.out.println("Lights off!!!");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState gateState = (GateState)evt.getNewValue();
        switch (gateState){
            case closing:
                flashRedColor();
                break;
            case opening:
                flashOrangeColor();
                break;
            default:
                stopFlash();
        }
    }
}
