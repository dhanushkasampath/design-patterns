package com.learnings.designpatterns.creational.factory.example_1;

public class Main {
    public static void main(String[]args){
        OsFactory osf=new OsFactory();
        Os obj=osf.getInstance("open");
        obj.feature();
    }
}
