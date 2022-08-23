package com.learnings.designpatterns.creational.prototype;

import lombok.Data;

@Data
public class Book {
    private int bid;
    private String bname;

    @Override
    public String toString() {
        return "Book [bid=" + bid + ", bname=" + bname + "]";
    }
}
