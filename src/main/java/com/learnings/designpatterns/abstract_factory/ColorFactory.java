package com.learnings.designpatterns.abstract_factory;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    //i think this is not good
    @Override
    Shape getShape(String shape) {
        return null;
    }
}
