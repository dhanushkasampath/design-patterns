package com.learnings.designpatterns.creational.abstract_factory.example_2;

public interface AbstractFactory {
    abstract Profession getProfession(String typeOfProfession);
}
