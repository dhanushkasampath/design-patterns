package com.learnings.designpatterns.behavioural.template_method;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();//this is the order
        startPlay();
        endPlay();
    }
}

/**
 * *here abstract class is used to prevent object creation from it.
 * *abstract methods are used to allow them to override.
 * *play() method has final modifier to prevent overriding of that method.
 * *play method is the template method with collection of methods in a certain order.
 */