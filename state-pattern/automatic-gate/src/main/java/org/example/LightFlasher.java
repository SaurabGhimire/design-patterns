package org.example;

import org.example.states.GateState;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LightFlasher  {

    public void flashRedColor(){
        System.out.println("Flashing RED.");
    }

    public void flashOrangeColor(){
        System.out.println("Flashing ORANGE.");
    }

    public void stopFlash(){
        System.out.println("Lights off!!!");
    }

}
