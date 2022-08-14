package com.learnings.designpatterns.behavioural.visitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);//this is the Monitor object
    }
}
