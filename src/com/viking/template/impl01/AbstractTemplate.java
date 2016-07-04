package com.viking.template.impl01;

public abstract class AbstractTemplate {

    private void templateMethod(){
        abstractMethod() ;
        hookMethod() ;
        concreteMethod() ;
    }

    protected abstract void abstractMethod() ;

    protected void hookMethod(){
        //空实现
    }

    private final void concreteMethod(){

    }
}
