package com.learnings.designpatterns.creational.abstract_factory.example_1;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square->draw method");
    }
}
