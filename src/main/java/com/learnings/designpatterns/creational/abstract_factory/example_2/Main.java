package com.learnings.designpatterns.creational.abstract_factory.example_2;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
        Profession eng = abstractFactory.getProfession("Engineer");
        eng.print();
    }
}
