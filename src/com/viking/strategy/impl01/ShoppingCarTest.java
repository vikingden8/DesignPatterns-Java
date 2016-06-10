package com.viking.strategy.impl01;

public class ShoppingCarTest {

    public static void main(String[] args){
        ShoppingCar shoppingCar = new ShoppingCar() ;
        shoppingCar.addItem(new Item("34242432432" , 454));
        shoppingCar.addItem(new Item("54356777655" , 99));

        shoppingCar.pay(new CCBPayStrategy());

        shoppingCar.pay(new WePayStrategy());

        shoppingCar.pay(new ZhifubaoPayStrategy());
    }
}




