package framework.commands;

import framework.domain.CarController;

public class Decrement implements Command{
    CarController carController;

    public Decrement(CarController carController){
        this.carController = carController;
    }
    @Override
    public void execute() {
        carController.decreaseSpeed();
    }

    @Override
    public void unexecute() {
        carController.increaseSpeed();
    }
}
