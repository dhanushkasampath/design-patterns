package com.learnings.designpatterns.behavioural.template;

public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football game initialized");
    }

    @Override
    void start() {
        System.out.println("Football game started");
    }

    @Override
    void end() {
        System.out.println("Football game ended");
    }
}
