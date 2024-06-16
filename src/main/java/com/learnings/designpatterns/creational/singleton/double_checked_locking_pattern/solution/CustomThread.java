package com.learnings.designpatterns.creational.singleton.double_checked_locking_pattern.solution;

public class CustomThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Current thread name->" + Thread.currentThread().getName() + " | Hashcode->" +   SatelliteOne.getSatellite().hashCode());                                                                                                                    //method eka retun karai
        }
    }
}
