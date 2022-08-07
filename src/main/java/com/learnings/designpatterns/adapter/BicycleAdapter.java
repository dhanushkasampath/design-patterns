package com.learnings.designpatterns.adapter;

public class BicycleAdapter implements Vehicle{

    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.ride();
    }
}
