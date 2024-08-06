package application;

public class CarController extends framework.domain.CarController {
    Car car;
    public CarController(Car car){
        super(new Below40(), car);
        this.car = car;
    }

    public void jump(){
        car.jump();
    }
}
