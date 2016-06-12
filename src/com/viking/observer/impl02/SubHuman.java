package com.viking.observer.impl02;

public class SubHuman implements ISubscribe{

    private String name ;

    public SubHuman(String name){
        this.name = name ;
    }

    @Override
    public void newPaperCome() {
        System.out.println(name + " !! News paper has come!!");
    }
}
