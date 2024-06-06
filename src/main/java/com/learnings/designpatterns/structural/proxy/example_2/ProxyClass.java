package com.learnings.designpatterns.structural.proxy.example_2;

public class ProxyClass extends RealSubjectClass{

    @Override
    public void method() {
        System.out.println("Hi, I'm proxy. I will perform authentication and security checks");

        // logic to check if user is authentic or not. If yes then call real object
        // method else dont call below method
        if(true){
            System.out.println("Calling real method of Real subject implementing class after the call is authenticated");
            super.method();
        }else{
            System.out.println("Prevented calling the Real subject implementing class since authentication failed");
        }
    }
}
