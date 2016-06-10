package com.viking.strategy.impl01;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCar {

    private List<Item> items ;

    public ShoppingCar(){
        items = new LinkedList<>() ;
    }

    public void addItem(Item item){
        this.items.add(item) ;
    }

    public long calculateTotal(){
        long sum = 0 ;
        for (Item item : items){
            sum += item.getPrice() ;
        }
        return sum ;
    }

    public void pay(PayStrategy strategy){
        long amount = calculateTotal() ;
        strategy.pay(amount);
    }
}
