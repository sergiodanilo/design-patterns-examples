package com.personal.examples.structural.composite;

public class LeafProduct extends ComponentProduct {

    private String name;
    private Double price;

    LeafProduct() {}

    public LeafProduct(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void add(ComponentProduct... componentProducts) {
    }

    public String toString() {
        return "Name: " + name + " Price: " + price;
    }

}
