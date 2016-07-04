package com.viking.template.impl02;

import com.viking.util.Log;

public class Client {

    public static void main(String[] args){
        Account account = new CurrentAccount() ;
        account.handle("test01" , "123456");

        Log.info("Template" , "********************************");
        account = new SavingAccount();
        account.handle("test02" , "654321");
    }
}
