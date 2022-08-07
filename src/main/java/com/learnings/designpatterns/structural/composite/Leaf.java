package com.learnings.designpatterns.structural.composite;

public class Leaf implements Component {

    int price;
    String name;

    public Leaf(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println("name:" + name + "|" + "price:" + price);
    }
}
