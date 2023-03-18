import Lesson1_1.Author;
import Lesson1_1.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1:");
        Author authorName1 = new Author("Лев", "Толстой");
        Book book1 = new Book(authorName1, "Война и Мир", 1987);
            System.out.println("book1.getAuthor() = " + authorName1.getFirstName() + " " + authorName1.getLastName());
            System.out.println("book1.getName() = " + book1.getName());
            System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        book1.setDatePublishing(2000);
            System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
            System.out.println();
        System.out.println("Книга 2:");
        Author authorName2 = new Author("Константин", "Беляев");
        Book book2 = new Book(authorName2, "Звезда КЭЦ", 1967);
        System.out.println("book2.getAuthor() = " + authorName2.getFirstName() + " " + authorName2.getLastName());
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
        book1.setDatePublishing(2020);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
    }
}