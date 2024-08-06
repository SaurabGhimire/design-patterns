package application;

import framework.states.CarState;

public class Between40And80 implements CarState {
    @Override
    public int computeSpeed() {
        return 2;
    }

    @Override
    public CarState updateState(int speed) {
        if(speed<40){
            return new Below40();
        } else if(speed>80){
            return new Above80();
        }
        return this;
    }
}
