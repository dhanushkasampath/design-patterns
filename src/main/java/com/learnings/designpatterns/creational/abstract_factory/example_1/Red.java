package com.learnings.designpatterns.creational.abstract_factory.example_1;

public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red->fill method");
    }
}
