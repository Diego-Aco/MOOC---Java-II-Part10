
public class Book {

    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int ReleaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }

    //I wrote this method to make it easier to see the results when testing readBooks
    public String toString() {
        return String.format("Title: %s, Published %s, %s pages, Written by %s", 
            this.name, this.publishingYear, this.pageCount, this.author);
    }

}
