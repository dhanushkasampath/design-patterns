package com.learnings.designpatterns.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory implements Shape {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        //if there is no color early create a new object
        //if it is already there return the current object
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);

        }
        return circle;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub

    }
}
