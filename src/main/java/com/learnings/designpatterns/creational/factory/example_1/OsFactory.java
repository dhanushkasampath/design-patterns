package com.learnings.designpatterns.creational.factory.example_1;

public class OsFactory {
    public Os getInstance(String str) {
        if (str.equals("open")) {
            return new Android();
        } else if (str.equals("closed")) {
            return new Ios();
        } else {
            return new Windows();
        }
    }
}
