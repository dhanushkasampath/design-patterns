package com.learnings.designpatterns.creational.builder;

public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os,ram,processor,screenSize,battery);
    }
}

/**
 * Here what have done is initialized the features of the phone.
 * have setter methods with PhoneBuilder return type.
 *
 * finaly created a getPhone() method to return a phone object.
 */