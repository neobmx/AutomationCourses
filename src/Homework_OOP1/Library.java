package Homework_OOP1;

/*
Библиотека:
        свойства:
        - список книг
        услуги библиотеки:
        - поиск по автору
        - поиск по издательству
        - поиск по году выпуска (выпуск после заданого года)
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library implements Searcher {

    private final List<Book> books = new ArrayList<>();

    public void addBook(final Book book) {
        this.books.add(book);
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter((it) -> it.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooksByPublisher(String publisher) {
        return books.stream()
                .filter(it -> it.getPublisher().equals(publisher))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooksByYear(int year) {
        return books.stream()
                .filter((it) -> it.getYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooksAfterYear(int year) {
        return books.stream()
                .filter((it) -> it.getYear() < year)
                .collect(Collectors.toList());
    }
}

