package com.viking.observer.jdk;


public class Client {

    public static void main(String[] args){

        PeopleDailyNewpaper dailyNewpaper = new PeopleDailyNewpaper() ;

        dailyNewpaper.addObserver(new SubMan("Viking Den"));
        dailyNewpaper.addObserver(new SubMan("Andy Liu"));
        dailyNewpaper.addObserver(new SubMan("Richard Lin"));

        dailyNewpaper.addNews("This is a fake new's content");

    }
}





