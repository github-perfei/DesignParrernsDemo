package com.observer.observer;

import com.observer.subject.Subject;

public class ConcreteObserver implements ObserverInterface {
    private String name;
    private String status;
    private Subject mSubject;

    public ConcreteObserver(Subject mSubject,String name) {
        this.mSubject = mSubject;
        this.name = name;
        this.status = "初始状态";
    }

    @Override
    public void update() {
        status = mSubject.getStatus();
        System.out.println(name + " status:" + status);
    }
}
