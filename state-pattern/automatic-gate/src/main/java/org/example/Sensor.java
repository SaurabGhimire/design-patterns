package org.example;

public class Sensor {
    GateController gateController;

    public Sensor(GateController gateController){
        this.gateController = gateController;
    }
    public void sensorOpenSignal(){
        gateController.sensorOpenSignal();
    }

    public void sensorClosedSignal(){
        gateController.sensorClosedSignal();
    }
}
