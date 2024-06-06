package com.learnings.designpatterns.creational.abstract_factory.example_2;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("I'm in Teacher Class");
    }
}
