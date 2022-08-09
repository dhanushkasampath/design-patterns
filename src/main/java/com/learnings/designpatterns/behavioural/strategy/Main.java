package com.learnings.designpatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));//here context is an object of OperationAdd


        context = new Context(new OperationSubstract());//replace the object
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));//here context is an object of
        // OperationSubstract


        context = new Context(new OperationMultiply());//replace the object
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));//here context is an object of
        // OperationMultiply
    }
}
//accordingly, the class behavior or its algorithm can be changed at run time.
