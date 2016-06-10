package com.viking.strategy.impl01;

public class Item {

    private final String upcCode ;

    private final long price ;

    public Item(String upcCode, long price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public long getPrice() {
        return price;
    }
}




