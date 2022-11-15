package com.gmail.vishchak.denis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

class Book {
    String name;
    Integer pages;
    String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}

class Books {
    Book[] books;

    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}


public class Main {
    static String JSON_TEXT = """
              {
              "books": [
                 {
                    "name": "All quiet on the western front",
                    "pages": 296,
                    "author": "Erich Maria Remarque"
                 },
                 {
                    "name": "Flew over the cuckoo's nest",
                    "pages": 325,
                    "author": "Ken Kesey"
                 }
              ]
            }
                        """;

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        Books books = gson.fromJson(JSON_TEXT, Books.class);
        System.out.println(books);
    }
}