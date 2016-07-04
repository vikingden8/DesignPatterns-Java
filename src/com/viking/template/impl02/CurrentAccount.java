package com.viking.template.impl02;

import com.viking.util.Log;

public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        Log.info("Template" , "按活期利率计算利息！");
    }
}
