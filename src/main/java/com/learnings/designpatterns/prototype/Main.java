package com.learnings.designpatterns.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs=new BookShop();
        bs.setShopName("Sarasavi");
        bs.loadDate();
        System.out.println(bs);

//        BookShop bs1=new BookShop();
//        bs1.setShopName("Gunasena");
//        bs1.loadDate();
//        System.out.println(bs1);

        //here we take a copy of the first object. not generating books again
        BookShop bs1=(BookShop)bs.clone();
        bs1.setShopName("Vijitha yapa");
        System.out.println(bs1);

    }
}
