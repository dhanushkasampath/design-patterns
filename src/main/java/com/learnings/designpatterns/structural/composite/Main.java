package com.learnings.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args) {

        //creating leaf objects
        Component hd = new Leaf(9000, "HDD");
        Component mouse = new Leaf(300, "Mouse");
        Component monitor = new Leaf(12000, "Monitor");
        Component ram = new Leaf(2000, "RAM");
        Component cpu = new Leaf(8000, "CPU");

        //creating composite objects
        Composite ph = new Composite("Periperal");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        //adding leaves to composite object
        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(monitor);
        ph.addComponent(mouse);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(ph);

//        ph.showPrice();
//        computer.showPrice();
        cabinet.showPrice();
//        ram.showPrice();
    }
}
