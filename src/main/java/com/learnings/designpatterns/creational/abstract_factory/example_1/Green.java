package com.learnings.designpatterns.creational.abstract_factory.example_1;

public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green->fill method");
    }
}
