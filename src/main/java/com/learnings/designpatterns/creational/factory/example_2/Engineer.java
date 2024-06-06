package com.learnings.designpatterns.creational.factory.example_2;

public class Engineer implements Profession{
    @Override
    public void print() {
        System.out.println("I'm in Engineer class");
    }
}
