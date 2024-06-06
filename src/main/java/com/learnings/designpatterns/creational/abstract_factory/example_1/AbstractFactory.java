package com.learnings.designpatterns.creational.abstract_factory.example_1;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
