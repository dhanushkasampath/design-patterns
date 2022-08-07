package com.learnings.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Phone phone=new PhoneBuilder().setOs("Android").setRam(512).getPhone();//here we have only passed the objects
        // we want.
        System.out.print(phone);
    }
}

//? Does builder pattern and requiredArgsConstructor same