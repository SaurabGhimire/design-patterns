package framework.domain;

import framework.observers.Subject;
import framework.states.CarState;

public class CarController extends Subject {
    Car car;
    CarState carState;
    public CarController(CarState carState){
        this.car = new Car();
        this.carState = carState;
    }

    public void increaseSpeed(){
        int additionalSpeed = carState.computeSpeed();
        car.changeSpeedBy(additionalSpeed);
        carState.updateState(car.getSpeed());
    }

    public void decreaseSpeed(){
        int additionalSpeed = carState.computeSpeed();
        car.changeSpeedBy(additionalSpeed * -1);
        carState.updateState(car.getSpeed());
    }
}
