package org.example;

import org.example.states.GateState;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

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

}
