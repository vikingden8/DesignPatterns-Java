package com.viking.builder.impl01;

import com.viking.util.Log;

public class Client {

    public static void main(String[] args){

        Director director = new ConcreteDirector(new ConcreteBuilder()) ;

        Product product = director.construct() ;

        Log.info("Builder" , product.getPartA().getName());
        Log.info("Builder" , product.getPartB().getName());
        Log.info("Builder" , product.getPartC().getName());

    }
}



