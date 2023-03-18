import Lesson1_1.Author;
import Lesson1_1.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1:");
        Author authorName1 = new Author("Лев", "Толстой");
        Book book1 = new Book(authorName1, "Война и Мир", 1987);
            System.out.println("book1.getAuthor() = " + book1.getAuthor());
            System.out.println("book1.getName() = " + book1.getName());
            System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        book1.setDatePublishing(2000);
            System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
            System.out.println();
        System.out.println("Книга 2:");
        Author authorName2 = new Author("Константин", "Беляев");
        Book book2 = new Book(authorName2, "Звезда КЭЦ", 1967);
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
        book1.setDatePublishing(2020);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        System.out.println();
        System.out.println("сравнение метод equals");
        Author authorName3 = new Author("Константин", "Беляев");
        Book book3 = new Book(authorName2, "Звезда КЭЦ", 1967);
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book2.equals(book3) = " + book2.equals(book3));
        System.out.println("authorName1.equals(authorName2) = " + authorName1.equals(authorName2));
        System.out.println("authorName2.equals(authorName3) = " + authorName2.equals(authorName3));
        System.out.println("метод hashCode");
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        System.out.println("book3.hashCode() = " + book3.hashCode());
        System.out.println("authorName1.hashCode() = " + authorName1.hashCode());
        System.out.println("authorName2.hashCode() = " + authorName2.hashCode());
        System.out.println("authorName3.hashCode() = " + authorName3.hashCode());
    }
}