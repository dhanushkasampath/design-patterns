package com.learnings.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component component){//this method add components to the arraylist
        components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c:components) {//this loops the global arraylist object and execute showPrice() in each
            // component object
            c.showPrice();
        }
    }
}
