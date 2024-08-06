package framework.states;

import application.CarController;

public class Below70 implements CarState{
    @Override
    public int computeSpeed() {
        return 1;
    }

    public CarState updateState(int speed){
        if(speed > 70){
            return new Above70();
        }
        return this;
    }
}
