package com.learnings.designpatterns.behavioural.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
