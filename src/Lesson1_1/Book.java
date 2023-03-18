package Lesson1_1;

public class Book {
    private String name;
    private Author author;
    private int publishingYear;

    public Book(Author author, String name, int publishingYear) {
        this.author = author;
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setDatePublishing(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
