package com.learnings.designpatterns.behavioural.command;

public class Main {
    public static void main(String[] args) {
        Stock abcStock = new Stock();//creates new Stock obj

        /**
         * pass the created Stock obj and create BuyStock and
         * SellStock objs
         */
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();//creates Broker obj
        broker.takeOrder(buyStockOrder);//add to list in Broker obj
        broker.takeOrder(sellStockOrder);//add to list in Broker obj

        broker.placeOrders();
    }
}
