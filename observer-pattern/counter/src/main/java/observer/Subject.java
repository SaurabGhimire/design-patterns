package observer;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Subject {
    Collection<Observer> observers;

    public Subject(){
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void doNotify(int count){
        for(Observer  observer: observers){
            observer.update(count);
        }
    }
}
