package application;

import framework.states.CarState;

public class Below40 implements CarState {

    @Override
    public int computeSpeed() {
        return 1;
    }

    @Override
    public CarState updateState(int speed) {
        if(speed>=40){
            return new Between40And80();
        }
        return this;
    }
}
