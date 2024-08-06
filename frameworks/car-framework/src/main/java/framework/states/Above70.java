package framework.states;

public class Above70 implements CarState{
    @Override
    public int computeSpeed() {
        return 3;
    }

    public CarState updateState(int speed){
        if(speed <= 70){
            return new Below70();
        }
        return this;
    }
}
