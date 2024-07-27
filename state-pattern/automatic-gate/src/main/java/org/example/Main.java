package org.example;

public class Main {
    public static void main(String[] args) {
        GateController gateController = new GateController();

        Remote remote = new Remote(gateController);
        Sensor sensor = new Sensor(gateController);

        // Listeners
        Gate gate = new Gate();
        Buzzer buzzer = new Buzzer();
        LightFlasher flasher = new LightFlasher();

        gateController.addListener(gate);
        gateController.addListener(buzzer);
        gateController.addListener(flasher);


        System.out.println("Application Starts...\nGate is initially closed");

        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        sensor.sensorOpenSignal();
        remote.pressButton();
        sensor.sensorClosedSignal();



    }
}