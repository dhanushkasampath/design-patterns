package com.learnings.designpatterns.structural.proxy.example_2;

public class RealSubjectClass implements Subject {
    @Override
    public void method() {
        System.out.println("I am the actual implementation of subject. rest of them are proxies. :D");
    }
}
