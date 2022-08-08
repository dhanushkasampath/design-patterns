package com.learnings.designpatterns.behavioural.mediator;

public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("hello how are you?");
        john.sendMessage("hi everyone");
    }
}