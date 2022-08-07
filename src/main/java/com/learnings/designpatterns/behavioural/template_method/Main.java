package com.learnings.designpatterns.behavioural.template_method;

public class Main {
    public static void main(String[] args) {
        Game g=new Cricket();
        g.play();

        System.out.println();

        g=new Football();
        g.play();
    }
}

//here output will print in an order