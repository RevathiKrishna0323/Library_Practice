/*
 * Author Name: Revathi
 * Date: 11-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

public class Book {
    String title;
    int yearOfPublishing;
    String isbnNumber;
    String authorName;

    public Book() {
    }

    public Book(String title, int yearOfPublishing, String isbnNumber, String authorName) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
    }
}
