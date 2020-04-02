package Homework_OOP1;


/*=== Библиотека ===
        Книга:
        свойства:
        - название
        - автор
        - издательство
        - год издания
        - количество страниц
        - тип переплета
        - цена*/


public class Book {

    private final String name;
    private final String author;
    private final String publisher;
    private final int year;
    private int pageNumber;
    private final Cover cover;
    private double price;

    public Book(final String name, final String author, final String publisher, final int year,
                final int pageNumber, final Cover cover, final double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.cover = cover;
        setPrice(price);
        setPageNumber(pageNumber);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public Cover getCover() {
        return cover;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        if (price > 0) {
            this.price = price;
        } else throw new IllegalArgumentException("Price must be more than 0");
    }

    private void setPageNumber(final int pageNumber) {
        if (pageNumber > 0) {
            this.pageNumber = pageNumber;

        } else throw new IllegalArgumentException("Page number must be more than 0");
    }
}
