package com.learnings.designpatterns.structural.flyweight;

public class Main {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            //creating 20 circle objects
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());

            //methana wenne over ride wiimak danata thiyena object ekatama
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    //this is a way to get random colors.
    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
