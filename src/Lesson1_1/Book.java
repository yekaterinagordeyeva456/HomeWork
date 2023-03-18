package Lesson1_1;

import java.util.Objects;

public class Book {
    private Author author;
    private String name;
    private int publishingYear;

    public Book(Author author, String name, int publishingYear) {
        this.author = author;
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setDatePublishing(int publishingYear) {
        this.publishingYear = publishingYear;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishingYear);
    }
}
