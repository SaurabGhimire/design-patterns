package org.example;

import org.example.states.GateState;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Buzzer  {
    public void start(){
        System.out.println("Buzzing.....");
    }

    public void stop(){
        System.out.println("STOPPED Buzzing!!");
    }


}
