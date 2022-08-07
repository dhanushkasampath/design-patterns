package com.learnings.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("-------------------------");

        //calling the display() again. then image will not be loaded from disk
        image.display();
    }
}
