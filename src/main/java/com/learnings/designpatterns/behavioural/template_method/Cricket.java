package com.learnings.designpatterns.behavioural.template_method;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game started");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game finished");
    }
}
