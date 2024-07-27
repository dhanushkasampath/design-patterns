package com.learnings.designpatterns.structural.flyweight.example_2;

import java.util.HashMap;

/**
 * This is a refactored version of AnimalFactory
 */
public class AnimalFactory2 {

    private static final HashMap<String, Animal> animalMap = new HashMap<>();

    public static Animal getAnimal(String name) {
        Animal animal = animalMap.get(name);

        if (animal != null) {
            return animal;
        } else {
            animal = generateAnimal(name);
            animal.setName(name);
            animalMap.put(name, animal);
        }
        return animal;
    }

    private static Animal generateAnimal(String name) {
        if ("CAT".equalsIgnoreCase(name)) {
            return new Cat();
        } else if ("DOG".equalsIgnoreCase(name)) {
            return new Dog();
        } else {
            return new Cow();
        }
    }
}
