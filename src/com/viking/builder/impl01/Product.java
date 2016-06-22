package com.viking.builder.impl01;

public class Product {

    private PartA partA ;
    private PartB partB ;
    private PartC partC ;

    public Product(PartA partA, PartB partB, PartC partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public PartA getPartA() {
        return partA;
    }

    public PartB getPartB() {
        return partB;
    }

    public PartC getPartC() {
        return partC;
    }
}
