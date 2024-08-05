package framework.states;

public interface CarState {
    int computeSpeed();
    CarState updateState(int speed);
}
