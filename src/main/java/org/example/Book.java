package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public Book(String title) {
        this.title = title;
        this.numberOfPages = 0;
        this.publicationYear = 0;
    }

    public Book() {
        this.title = "Unknown";
        this.numberOfPages = 0;
        this.publicationYear = 0;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + ", Pages: " + getNumberOfPages() + ", Year: " + getPublicationYear();
    }
}
