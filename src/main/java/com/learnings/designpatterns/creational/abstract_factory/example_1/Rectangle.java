package com.learnings.designpatterns.creational.abstract_factory.example_1;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle->draw method");
    }
}
