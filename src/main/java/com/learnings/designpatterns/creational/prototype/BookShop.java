package com.learnings.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public void loadDate() { //creating a list of books
        for (int i = 1; i <= 10; i++) {//instead of getting from a db
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book" + i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }

    //additionally we need to implement Cloneable in BookShop and over ride clone() in it. BookShop class should be like this
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
