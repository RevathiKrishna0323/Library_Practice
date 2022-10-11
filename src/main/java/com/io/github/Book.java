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
        String title = "Harry Potter";
        int yearOfPublishing = 2000;
        String isbnNumbe = "12345";
        String authorName = "Revathi";

    }

    public Book(String title, int yearOfPublishing, String isbnNumber, String authorName) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
    }

    public void displayDetails() {
        System.out.println("title = " + title);
        System.out.println("Year of publishing = " + yearOfPublishing);
        System.out.println("ISBN Number = " + isbnNumber);
        System.out.println("Author Name = " + authorName);
    }

}
