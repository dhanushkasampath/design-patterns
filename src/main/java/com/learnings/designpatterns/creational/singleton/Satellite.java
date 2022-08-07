package com.learnings.designpatterns.creational.singleton;

public class Satellite {
    private Satellite() {}// once the constructor is private you can not create new objects using new key word from
    // other classes
    private static Satellite a;

    public static Satellite getSatellite() {
        if (a == null) {
            a = new Satellite();
        }
        return a;
    }
}
