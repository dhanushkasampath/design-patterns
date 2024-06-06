package com.learnings.designpatterns.creational.abstract_factory.example_2;

public class ProfessionAbstractFactory implements AbstractFactory{

    @Override
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        }
        if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }
        return null;
    }
}
