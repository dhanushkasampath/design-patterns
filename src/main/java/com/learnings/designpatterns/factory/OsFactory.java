package com.learnings.designpatterns.factory;

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
