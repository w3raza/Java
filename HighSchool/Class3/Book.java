/**
 * 17.Utwórz klasę Book przechowującą informacje o książce: np
 * title,author,pageCount,price, 1)W klasie testujacej utwórz listę książek i
 * posortuj je po autorze. 2)Napisz komparatory do sortowania ksiązek po ilości
 * stron oraz po cenie i tytule. 3)Napisz klasę testującą cały program.
 */

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private Integer pageCount;
    private Double price;

    Book(String title, String author, Integer pageCount, Double price) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.price = price;
    }

    public String toString() {
        return "[AUTHOR: " + author + ", TITLE: \"" + title + "\", PAGE COUNT: " + pageCount + ", PRICE: " + price
                + "]";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPage() {
        return pageCount;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        return this.getAuthor().compareTo(o.getAuthor());
    }

}