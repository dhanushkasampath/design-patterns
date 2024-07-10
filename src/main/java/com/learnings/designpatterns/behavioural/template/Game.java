package com.learnings.designpatterns.behavioural.template;

public abstract class Game {

    // below 3 methods are governed by client
    abstract void initialize();
    abstract void start();
    abstract void end();

    //below method is invoked by abstract class it self
    //template method -> we have taken an abstract method due to need of providing implementation to play() method
    public final void play(){
        initialize();
        start();
        end();
    }
}
