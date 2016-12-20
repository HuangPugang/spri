package com.example.domain;

import java.awt.print.Book;

/**
 * Created by paul on 16/11/30.
 */
public class UserBook extends User{
    String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
