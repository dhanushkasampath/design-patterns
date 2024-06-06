package com.learnings.designpatterns.creational.abstract_factory.example_1;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle->draw method");
    }
}
