package com.learnings.designpatterns.behavioural.visitor;

public class Computer implements ComputerPart {

    private final ComputerPart[] parts;

    //constructor
    public Computer() {
        parts = new ComputerPart[]{ new Mouse(), new Keyboard(), new Monitor() }; //creating new array with new objects
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
