package com.viking.observer.impl01;

/**
 * Created by Viking Den on 2016/6/12.
 */
public class ConcreteObserver implements Observer {

    private ConcreteSubject cSubject ;

    private String oName ;

    private String state ;

    public ConcreteObserver(ConcreteSubject cSubject , String name){
        this.cSubject = cSubject ;
        this.oName = name ;
    }

    @Override
    public void update() {
        state = cSubject.getState() ;
        System.out.println("Observer : " + oName + " state update : " + state);
    }
}
