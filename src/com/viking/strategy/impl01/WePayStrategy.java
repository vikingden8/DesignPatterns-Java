package com.viking.strategy.impl01;

import com.viking.util.Log;

public class WePayStrategy implements PayStrategy {

    @Override
    public void pay(long amount) {
        Log.info("Strategy" , amount + " paid with WeChat Pay.");
    }

}




