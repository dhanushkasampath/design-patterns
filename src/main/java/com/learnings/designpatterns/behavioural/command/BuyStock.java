package com.learnings.designpatterns.behavioural.command;

/**
 * This class has implemented the interface. So it has to override the execute() method
 */
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
