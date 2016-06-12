package com.viking.observer.impl02;

public class Client {

    public static void main(String[] args){

        PeopleDailyNewsPaper peopleDailyNewsPaper = new PeopleDailyNewsPaper() ;

        SubHuman xiaoming = new SubHuman("XiaoMing") ;
        SubHuman xiaodeng = new SubHuman("XiaoDeng") ;
        SubHuman xiaowang = new SubHuman("XiaoWang") ;

        peopleDailyNewsPaper.registerSubscribe(xiaoming);
        peopleDailyNewsPaper.registerSubscribe(xiaodeng);
        peopleDailyNewsPaper.registerSubscribe(xiaowang);

        peopleDailyNewsPaper.sendNewspaper();

        System.out.println("********************************************");

        peopleDailyNewsPaper.unregisterSubscribe(xiaoming);

        peopleDailyNewsPaper.sendNewspaper();


    }
}
