package com.viking.observer.impl02;

import java.util.ArrayList;
import java.util.List;


public abstract class INewsPaper {

    protected List<ISubscribe> subscribes ;

    public INewsPaper(){
        subscribes = new ArrayList<>() ;
    }

    public void registerSubscribe(ISubscribe subscribe){
        if (!subscribes.contains(subscribe)){
            subscribes.add(subscribe) ;
        }
    }

    public void unregisterSubscribe(ISubscribe subscribe){
        if (subscribes.contains(subscribe)){
            subscribes.remove(subscribe) ;
        }
    }

    public void sendNewspaper() {
        for (ISubscribe subscribe : subscribes){
            subscribe.newPaperCome();
        }
    }

}
