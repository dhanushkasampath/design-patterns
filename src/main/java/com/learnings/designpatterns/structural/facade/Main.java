package com.learnings.designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        ShapeMaker s=new ShapeMaker();

        s.drawCircle();
        s.drawRectangle();
        s.drawSquare();
    }
}
