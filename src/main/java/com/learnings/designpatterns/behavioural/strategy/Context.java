package com.learnings.designpatterns.behavioural.strategy;

//context is the class which use the strategy
public class Context {
    //create Strategy type variable, strategy is an interface
    private final Strategy strategy;

    //To create context object strategy type object is needed
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //object ekata adaala doOperation method eka execute karai
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
