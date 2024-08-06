package application;

import framework.domain.Car;
import framework.observers.CarObserver;

public class DatabaseLogger implements CarObserver {
    SpeedDAO speedDAO;

    DatabaseLogger(){
        speedDAO = new SpeedDAO();
    }
    @Override
    public void update(Car car) {
        log(car.getSpeed());
    }

    private void log(int speed){
        speedDAO.save(speed);
    }
}
