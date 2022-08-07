package com.learnings.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
//            Satellite s=new Satellite();
            System.out.println(Satellite.getSatellite().hashCode());                                                                                                                    //method eka retun karai
//            System.out.println(s.hashCode());
        }
    }
}
