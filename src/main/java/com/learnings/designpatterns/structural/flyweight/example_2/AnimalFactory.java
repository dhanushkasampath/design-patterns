package com.learnings.designpatterns.structural.flyweight.example_2;

import java.util.HashMap;

/**
 * This contains a map and the logic to create new object if not in map.
 * else return the existing object in the map for the given key
 */
public class AnimalFactory {

    private static final HashMap<String, Animal> animalMap = new HashMap<>();

    public static Animal getCat(String name) {
        String key = name + "-CAT";
        Animal animal = animalMap.get(key);

        if (animal != null) {
            return animal;
        } else {
            animal = new Cat();
            animal.setName(name);
            animalMap.put(key, animal);
        }
        return animal;
    }

    public static Animal getDog(String name) {
        String key = name + "-DOG";
        Animal animal = animalMap.get(key);

        if (animal != null) {
            return animal;
        } else {
            animal = new Dog();
            animal.setName(name);
            animalMap.put(key, animal);
        }
        return animal;
    }

    public static Animal getCow(String name) {
        String key = name + "-COW";
        Animal animal = animalMap.get(key);

        if (animal != null) {
            return animal;
        } else {
            animal = new Cow();
            animal.setName(name);
            animalMap.put(key, animal);
        }
        return animal;
    }
}
