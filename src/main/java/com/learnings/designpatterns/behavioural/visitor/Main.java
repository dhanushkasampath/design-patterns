package com.learnings.designpatterns.behavioural.visitor;

public class Main {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
