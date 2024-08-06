package application;

import framework.commands.Command;

public class Jump implements Command {
    CarController carController;
    Jump(CarController carController){
        this.carController = carController;
    }
    @Override
    public void execute() {
        carController.jump();
    }

    @Override
    public void unexecute() {

    }
}
