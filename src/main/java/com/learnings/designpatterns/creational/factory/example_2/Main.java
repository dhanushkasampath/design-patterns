package com.learnings.designpatterns.creational.factory.example_2;

public class Main {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();

        Profession doc = professionFactory.getProfession("Doctor");
        doc.print();
    }
}
