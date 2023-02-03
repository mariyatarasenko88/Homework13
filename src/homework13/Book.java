package homework13;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int age;

    public Book(String bookName, Author author, int age) {
        this.bookName = bookName;
        this.author = author;
        this.age = age;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getAge() {
        return this.age;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Название книги: " + this.bookName + " " +  this.author + " Год выпуска книги - " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, age);
    }
}
