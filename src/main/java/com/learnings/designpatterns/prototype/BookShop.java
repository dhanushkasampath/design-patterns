package com.learnings.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadDate() { //creating a list of books
        for(int i=1;i<=10;i++){//instead of getting from a db
            Book b=new Book();
            b.setBid(i);
            b.setBname("Book"+i);
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
