package com.viking.template.impl02;

import com.viking.util.Log;

public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        Log.info("Template" , "按定期利率计算利息！");
    }
}
