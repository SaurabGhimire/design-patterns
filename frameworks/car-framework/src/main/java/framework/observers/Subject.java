package framework.observers;

import framework.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<CarObserver> observerList;

    public Subject(){
        observerList = new ArrayList<>();
    }

    public void doNotify(Car car){
        for(CarObserver observer: observerList){
            observer.update(car);
        }
    }

    public void addObserver(CarObserver observer){
        observerList.add(observer);
    }

    public void removeObserver(CarObserver observer){
        observerList.remove(observer);
    }
}
