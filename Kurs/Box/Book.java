// Klasa Book - klasa dziedzicząca po klasie Item zawierająca informacje o
// autorze książki i o tytule. Powinna zawierać odpowiedni konstruktor oraz
// przeciążone metody equals i toString.

public class Book extends Item {
    private String author;
    private String title;

    Book(int vol, String id, String author, String title) {
        super(id, vol);
        this.author = author;
        this.title = title;
    }

    Book(Book book) {
        super(book);
        this.author = book.author;
        this.title = book.title;
    }

    public String toString() {
        return "[Book] author: " + author + ", title: " + title + super.toString();

    }

    public boolean equals(Book obj) {
        super.equals(obj);

        Book book = (Book) obj;
        if (this.author.equals(book.author) && (this.title.equals(book.title)))
            return true;
        else
            return false;
    }
}