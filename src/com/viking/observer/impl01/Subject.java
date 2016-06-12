package com.viking.observer.impl01;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers  ;

    public Subject(){
        observers = new ArrayList<>() ;
    }

    public void attach(Observer observer){
        observers.add(observer) ;
    }

    public void detach (Observer observer){
        observers.remove(observer) ;
    }

    public void update(){
        for (Observer o: observers) {
            o.update();
        }
    }

}
