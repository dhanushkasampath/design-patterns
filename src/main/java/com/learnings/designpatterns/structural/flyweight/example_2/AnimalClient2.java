package com.learnings.designpatterns.structural.flyweight.example_2;

public class AnimalClient2 {
    public static void main(String[] args) {
        Animal catAnimal = AnimalFactory2.getAnimal("CAT");
        catAnimal.printAnimalAttributes();

        Animal catAnimal2 = AnimalFactory2.getAnimal("CAT");
        catAnimal2.printAnimalAttributes();

        Animal cowAnimal = AnimalFactory2.getAnimal("COW");
        cowAnimal.printAnimalAttributes();

        Animal dogAnimal = AnimalFactory2.getAnimal("DOG");
        dogAnimal.printAnimalAttributes();

        //hashcode of these two references are same. that means no new objects has created.
        // but the same object has used by changing its params
        System.out.println(catAnimal.hashCode());
        System.out.println(catAnimal2.hashCode());

        System.out.println(cowAnimal.hashCode());


    }
}
