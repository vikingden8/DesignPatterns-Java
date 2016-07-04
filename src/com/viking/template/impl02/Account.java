package com.viking.template.impl02;

import com.viking.util.Log;

/**
 * 某软件公司欲为某银行的业务支撑系统开发一个利息计算模块，利息计算流程如下：
 *
 * (1) 系统根据账号和密码验证用户信息，如果用户信息错误，系统显示出错提示；
 *
 * (2) 如果用户信息正确，则根据用户类型的不同使用不同的利息计算公式计算利息（如活期账户和定期账户具有不同的利息计算公式）；
 *
 * (3) 系统显示利息。
 *
 * 试使用模板方法模式设计该利息计算模块。
 */
public abstract class Account {

    //基本方法——具体方法
    private boolean validate(String account , String password){
        Log.info("Template" , "账号：" + account);
        Log.info("Template" , "密码：" + password);
        if (dataInDB(account , password)){
            return true ;
        }else{
            return false ;
        }
    }
    //基本方法——抽象方法
    protected abstract void calculateInterest();

    //基本方法——具体方法
    private final void Display()
    {
        Log.info("Template" , "显示利息！");
    }

    //模板方法
    public void handle(String account, String password) {
        if (!validate(account,password)) {
            Log.info("Template" , "账户或密码错误！");
            return;
        }
        calculateInterest();
        Display();
    }

    private final boolean dataInDB(String account, String password){
        //test method , always return true
        return true ;
    }
}
