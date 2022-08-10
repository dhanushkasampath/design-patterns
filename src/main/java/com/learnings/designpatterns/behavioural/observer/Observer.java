package com.learnings.designpatterns.behavioural.observer;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
