package com.learnings.designpatterns.behavioural.visitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);//this is the Monitor object
    }
}
