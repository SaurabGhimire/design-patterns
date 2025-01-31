package bank.observer;

import java.util.ArrayList;
import java.util.Collection;

public class Subject {
    private Collection<Observer> observerlist = new ArrayList<>();

    public void addObserver(Observer observer){
        observerlist.add(observer);
    }

    public void removeObserver(Observer observer){
        observerlist.remove(observer);
    }

    public void donotify(){
        for (Observer observer: observerlist){
            observer.update();
        }
    }
}
