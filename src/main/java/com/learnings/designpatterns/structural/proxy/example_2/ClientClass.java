package com.learnings.designpatterns.structural.proxy.example_2;

public class ClientClass {
    public static void main(String[] args) {
        Subject proxy = new ProxyClass();
        proxy.method();
    }
}
