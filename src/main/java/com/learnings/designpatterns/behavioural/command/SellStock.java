package com.learnings.designpatterns.behavioural.command;

public class SellStock implements Order {
    private Stock abcStock;

    //this is the constructor.it needs a Stock obj to create a SellStock obj
    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override//calls the sell method of Stock obj
    public void execute() {
        abcStock.sell();
    }
}
