package com.learnings.designpatterns.behavioural.template;

public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket game initialized");
    }

    @Override
    void start() {
        System.out.println("Cricket game started");
    }

    @Override
    void end() {
        System.out.println("Cricket game ended");
    }
}
