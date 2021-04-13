package org.example.library;

public class Books {
    private String title;
    private String ISBN;
    private String publishingYear;
    private int noOfCopy;

    public Books(String title, String ISBN, String publishingYear, int noOfCopy) {
        this.title = title;
        this.ISBN = ISBN;
        this.publishingYear = publishingYear;
        this.noOfCopy = noOfCopy;
    }

    public void getBookInfo() {

    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public int getNoOfCopy() {
        return noOfCopy;
    }
}
