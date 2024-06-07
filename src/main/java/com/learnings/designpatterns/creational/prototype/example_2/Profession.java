package com.learnings.designpatterns.creational.prototype.example_2;

//abstract class means that this class is not complete. there can be incomplete members as well as complete members
public abstract class Profession implements Cloneable {
    public int id;
    public String name;

    abstract void print();

    //this is a concrete method
    //this methods says how to clone an object
    public Object cloningMethod(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}


//For an object to be cloned using super.clone(), the class of the object must implement the Cloneable interface.
//If the class does not implement Cloneable, calling super.clone() will throw a CloneNotSupportedException.