package com.learnings.designpatterns.creational.singleton.double_checked_locking_pattern.solution;

/**
 * here we made below changes
 * 1. make the private variable volatile
 * 2. added the logic in synchronized block without synchronizing the whole getSatellite() method
 */
public class SatelliteOne {
    private SatelliteOne() {
        System.out.println("new satellite object created");
    }
    private static volatile SatelliteOne a;

    public static SatelliteOne getSatellite() {
        if (a == null) {
            synchronized (SatelliteOne.class){
                if(a == null){
                    a = new SatelliteOne();
                }
            }
        }
        return a;
    }
}
