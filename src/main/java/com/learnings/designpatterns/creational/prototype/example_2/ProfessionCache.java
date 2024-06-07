package com.learnings.designpatterns.creational.prototype.example_2;

import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer, Profession> professionMap = new Hashtable<>();

    public static Profession getCloneNewProfession(int id){
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    public static void loadProfessionCache(){
        Doctor doctor = new Doctor();
        doctor.id = 1;
        professionMap.put(doctor.id, doctor);

        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionMap.put(engineer.id, engineer);

        Teacher teacher = new Teacher();
        teacher.id = 3;
        professionMap.put(teacher.id, teacher);

    }
}
