package com.learnings.designpatterns.creational.abstract_factory.example_2;

public class TraineeProfessionAbstractFactory implements AbstractFactory{

    @Override
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        }
        if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new TraineeEngineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraineeTeacher();
        }
        return null;
    }
}
