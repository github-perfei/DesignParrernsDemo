package com.observer.client;

import com.observer.observer.ConcreteObserver;
import com.observer.observer.ObserverInterface;
import com.observer.subject.ConcreteSubject;
import com.observer.subject.Subject;

public class Main {
    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        ObserverInterface mico = new ConcreteObserver(subject,"mico");
        ObserverInterface nick = new ConcreteObserver(subject,"nick");
        subject.attach(mico);
        subject.attach(nick);

        subject.setStatus("改变状态");
        subject.notifyToObservers();
    }
}
