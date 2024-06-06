package com.learnings.designpatterns.creational.abstract_factory.example_2;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean isTrainee) {
        if (isTrainee) {
            return new TraineeProfessionAbstractFactory();
        } else {
            return new ProfessionAbstractFactory();
        }
    }
}
