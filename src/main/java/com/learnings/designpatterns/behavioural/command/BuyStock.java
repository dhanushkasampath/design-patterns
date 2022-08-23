package com.learnings.designpatterns.behavioural.command;

public class BuyStock implements Order {
    private Stock abcStock;

    //this is the constructor.it needs a Stock obj to create a BuyStock obj
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override//calls the buy method of Stock obj
    public void execute() {
        abcStock.buy();
    }
}
