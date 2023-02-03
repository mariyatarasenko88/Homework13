import homework13.Book;
import homework13.Author;
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Дом на краю ночи", new Author("Кэтрин", "Бэннер"), 2017);
        Book book1 = new Book("Дом на краю ночи", new Author("Кэтрин", "Бэннер"), 2017);
        Book book2 = new Book("Не навреди", new Author("Генри", "Марш"), 2016);

        System.out.println("Название первой книги - " + book.getBookName());
        System.out.println("Год выпуска: " + book.getAge());
        System.out.println("Автор книги " + book.getAuthor().getAuthorName() + " " + book.getAuthor().getAuthorSurname());
        System.out.println();
        System.out.println("Название второй книги - " + book2.getBookName());
        System.out.println("Год выпуска: " + book2.getAge());
        System.out.println("Автор книги " + book2.getAuthor().getAuthorName() + " " + book2.getAuthor().getAuthorSurname());
        book2.setAge(2017);
        System.out.println("Новый год выпуска книги: " + book2.getAge());
        System.out.println(book);
        System.out.println(book2);
        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));
    }


}
