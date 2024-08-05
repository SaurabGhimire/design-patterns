package framework.commands;

import framework.domain.CarController;

public class Increment implements Command{
    CarController carController;
    public Increment(CarController carController){
        this.carController = carController;
    }
    @Override
    public void execute() {
        carController.increaseSpeed();
    }

    @Override
    public void unexecute() {
        carController.decreaseSpeed();
    }
}
