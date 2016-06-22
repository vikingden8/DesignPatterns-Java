package com.viking.builder.impl01;


public class ConcreteBuilder implements Builder {
    private PartA partA ;
    private PartB partB ;
    private PartC partC ;
    @Override
    public void buildPartA() {
        System.out.println("build part A");
        partA = new PartA("Concrete PartA") ;
    }
    @Override
    public void buildPartB() {
        System.out.println("build part B");
        partB = new PartB("Concrete PartB") ;
    }
    @Override
    public void buildPartC() {
        System.out.println("build part C");
        partC = new PartC("Concrete PartC") ;
    }
    @Override
    public Product getResult() {
        return new Product(partA , partB , partC);
    }
}
