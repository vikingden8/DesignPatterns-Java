package com.viking.builder.impl01;


public class ConcreteDirector implements Director {

    private Builder builder ;

    public ConcreteDirector(Builder builder){
        this.builder = builder ;
    }

    @Override
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult() ;
    }
}



