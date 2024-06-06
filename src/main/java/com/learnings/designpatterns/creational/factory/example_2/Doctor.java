package com.learnings.designpatterns.creational.factory.example_2;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I'm in Doctor class");
    }
}
