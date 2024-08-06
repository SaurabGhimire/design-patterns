package application;

public class CarController extends framework.domain.CarController {
    Car car;
    public CarController(){
        super(new Below40(), new Car());
        car = new Car();
    }

    public void jump(){
        car.jump();
    }
}
