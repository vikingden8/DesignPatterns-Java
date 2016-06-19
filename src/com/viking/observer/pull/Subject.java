package com.viking.observer.pull;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {

    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer){
        list.add(observer);
    }

    public void detach(Observer observer){
        list.remove(observer);
    }

    public void nodifyObservers(){

        for(Observer observer : list){
            observer.update(this);
        }
    }
}




