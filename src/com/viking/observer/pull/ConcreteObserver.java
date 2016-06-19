package com.viking.observer.pull;

import com.viking.util.Log;

public class ConcreteObserver implements Observer {

    private String observerState;
    
    @Override
    public void update(Subject subject) {

        observerState = ((ConcreteSubject)subject).getState();
        Log.info("pull" , "观察者状态为：" + observerState);
    }

}

