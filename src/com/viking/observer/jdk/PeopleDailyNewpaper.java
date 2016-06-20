package com.viking.observer.jdk;


import java.util.Observable;

public class PeopleDailyNewpaper extends Observable {

    public void addNews(String content){
        setChanged();
        notifyObservers(content);
    }

}


