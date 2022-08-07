package com.learnings.designpatterns.creational.abstract_factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square->draw method");
    }
}
