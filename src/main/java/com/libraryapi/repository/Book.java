package com.libraryapi.repository;

public class Book {
    private String title;
    private String subtitle;
    private String description;
    private int authorId;
    private String year;
    private int pages;
    private float rate;
    private int publisherId;
    private String status;
    private int bookCoverId;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public float getRate() {
        return rate;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public String getStatus() {
        return status;
    }

    public int getBookCoverId() {
        return bookCoverId;
    }
}
