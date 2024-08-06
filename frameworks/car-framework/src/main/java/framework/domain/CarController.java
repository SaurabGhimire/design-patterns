package framework.domain;

import framework.observers.Subject;
import framework.states.Below70;
import framework.states.CarState;

public class CarController extends Subject {
    private final Car car;
    private CarState carState;
    public CarController(CarState carState, Car car){

        this.car = car != null ? car : new Car();
        this.carState = carState;
    }

    public void increaseSpeed(){
        int additionalSpeed = carState.computeSpeed();
        car.changeSpeedBy(additionalSpeed);
        carState = carState.updateState(car.getSpeed());
        doNotify(car);
    }

    public void decreaseSpeed(){
        int additionalSpeed = carState.computeSpeed();
        car.changeSpeedBy(additionalSpeed * -1);
        carState = carState.updateState(car.getSpeed());
        doNotify(car);
    }

    public Car getCar() {
        return car;
    }

    public CarState getCarState() {
        return carState;
    }
}
