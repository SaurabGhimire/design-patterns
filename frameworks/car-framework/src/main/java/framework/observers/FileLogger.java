package framework.observers;

import framework.domain.Car;

public class FileLogger implements CarObserver{
    @Override
    public void update(Car car) {
        log(car.getSpeed());
    }

    private void log(int speed){
        System.out.println("Logging speed:" + speed);
    }
}
