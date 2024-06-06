package com.learnings.designpatterns.structural.flyweight.example_2;

public class AnimalClient {
    public static void main(String[] args) {
        Animal catAnimal = AnimalFactory.getCat("CAT");
        catAnimal.printAnimalAttributes();

        Animal catAnimal2 = AnimalFactory.getCat("CAT");
        catAnimal2.printAnimalAttributes();

        Animal cowAnimal = AnimalFactory.getCow("COW");
        cowAnimal.printAnimalAttributes();

        Animal dogAnimal = AnimalFactory.getDog("DOG");
        dogAnimal.printAnimalAttributes();

        //hashcode of these two references are same. that means no new objects has created.
        // but the same object has used by changing its params
        System.out.println(catAnimal.hashCode());
        System.out.println(catAnimal2.hashCode());

        System.out.println(cowAnimal.hashCode());


    }
}
