package com.learnings.designpatterns.creational.builder.example_2;

public class FloodResistantBuilder implements Builder {

    private Home floodResistantHome = new Home();

    @Override
    public void buildFloor() {
        floodResistantHome.floor = "Water resistant floor";
    }

    @Override
    public void buildWalls() {
        floodResistantHome.walls = "Water resistant walls";
    }

    @Override
    public void buildTerrace() {
        floodResistantHome.terrace = "Water resistant terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodResistantHome;
    }
}
