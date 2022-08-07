package com.learnings.designpatterns.creational.factory;

public class Main {
    public static void main(String[]args){
        OsFactory osf=new OsFactory();
        Os obj=osf.getInstance("open");
        obj.feature();
    }
}
