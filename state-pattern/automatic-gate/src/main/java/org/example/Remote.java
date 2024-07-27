package org.example;

public class Remote {
    GateController gateController;

    public Remote(GateController gateController){
        this.gateController = gateController;
    }
    public void pressButton(){
        System.out.println("ButtonPressed!!!");
        gateController.pressButton();
    }
}
