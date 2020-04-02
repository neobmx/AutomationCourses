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

import java.util.List;

public interface Searcher {

    List<Book> findBooksByAuthor(String author);
    List<Book> findBooksByPublisher(String publisher);
    List<Book> findBooksByYear(int year);
    List<Book> findBooksAfterYear(int year);

}
