package com.learnings.designpatterns.creational.prototype.example_2;

public class Main {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        // main class try to get the profession using key.
        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

        Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teacherProfession);

        // here we have passed the same Id. then ideally I should get the same hashcode as first docProfession object.
        // but it is not like that. I got a different hashcode. that means a new object has created.
        // But how it has happened?
        //      Because I have
        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);
    }
}
