package com.viking.observer.impl01;

public class Client {

    public static void main(String[] args){

        ConcreteSubject subject = new ConcreteSubject() ;
        subject.attach(new ConcreteObserver(subject , "Observer 01"));
        subject.attach(new ConcreteObserver(subject , "Observer 02"));
        subject.attach(new ConcreteObserver(subject , "Observer 03"));

        subject.setState("Haha");
        subject.update();

    }
}



