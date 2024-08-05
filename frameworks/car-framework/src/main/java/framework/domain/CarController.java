package framework.domain;

import framework.observers.Subject;
import framework.states.Below70;
import framework.states.CarState;

public class CarController extends Subject {
    Car car;
    CarState carState;
    public CarController(CarState carState){
        this.car = new Car();
        this.carState = carState;
    }

    public CarController(){
        this.car = new Car();
        this.carState = new Below70();
    }

    public void increaseSpeed(){
        int additionalSpeed = carState.computeSpeed();
        car.changeSpeedBy(additionalSpeed);
        carState.updateState(car.getSpeed());
        doNotify(car);
    }

    public void decreaseSpeed(){
        int additionalSpeed = carState.computeSpeed();
        car.changeSpeedBy(additionalSpeed * -1);
        carState.updateState(car.getSpeed());
        doNotify(car);
    }
}
