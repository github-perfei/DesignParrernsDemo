package com.observer.subject;

import com.observer.observer.ObserverInterface;
import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    private Set<ObserverInterface> observers = new HashSet<>();

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void attach(ObserverInterface observer){
        observers.add(observer);
    }

    public void detach(ObserverInterface observer){
        observers.remove(observer);
    }

    public void notifyToObservers(){
        for (ObserverInterface observer : observers) {
            observer.update();
        }
    }
}
