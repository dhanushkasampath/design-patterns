package com.learnings.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Order> orderList = new ArrayList<>();

    //this method adds elements to array list
    public void takeOrder(Order order){
        orderList.add(order);
    }

    //this method loops the arraylist and call execute method of each. finally clear the arraylist
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
