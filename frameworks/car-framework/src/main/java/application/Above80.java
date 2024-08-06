package application;

import framework.states.CarState;

public class Above80 implements CarState {
    @Override
    public int computeSpeed() {
        return 3;
    }

    @Override
    public CarState updateState(int speed) {
        if(speed<=8){
            return new Between40And80();
        }
        return this;
    }
}
