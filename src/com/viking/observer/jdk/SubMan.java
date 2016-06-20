package com.viking.observer.jdk;

import com.viking.util.Log;

import java.util.Observable;
import java.util.Observer;

public class SubMan implements Observer {

    private String name ;

    public SubMan(String name){
        this.name = name ;
    }

    @Override
    public void update(Observable o, Object arg) {
        String content = (String) arg;
        Log.info("Observer-JDK" , name + " received news content : " + content);
    }
}





