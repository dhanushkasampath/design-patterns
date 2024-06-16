package com.learnings.designpatterns.creational.singleton.double_checked_locking_pattern.solution;

public class Main {
    public static void main(String[] args) {

        CustomThread thread = new CustomThread();
        CustomThread thread1 = new CustomThread();
        CustomThread thread2 = new CustomThread();
        CustomThread thread3 = new CustomThread();
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

        for(int i=0;i<5;i++){
            System.out.println("Current thread name->" + Thread.currentThread().getName() + " | Hashcode->" + SatelliteOne.getSatellite().hashCode());                                                                                                                    //method eka retun karai
        }
    }
}
