package org.example;

public class Main {
    public static void main(String[] args) {
        GateController gateController = new GateController();
        Remote remote = new Remote(gateController);
        Sensor sensor = new Sensor(gateController);

        System.out.println("Application Starts...\nGate is initially closed");

        remote.pressButton();
        remote.pressButton();
        sensor.sensorOpenSignal();
        remote.pressButton();
        sensor.sensorClosedSignal();



    }
}