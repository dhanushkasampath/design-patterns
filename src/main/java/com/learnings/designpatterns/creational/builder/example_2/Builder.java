package com.learnings.designpatterns.creational.builder.example_2;

public interface Builder {
    void buildFloor();
    void buildWalls();
    void buildTerrace();
    Home getComplexHomeObject();
}
