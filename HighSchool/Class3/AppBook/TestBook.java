import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 17.Utwórz klasę Book przechowującą informacje o książce: np
 * title,author,pageCount,price, 1)W klasie testujacej utwórz listę książek i
 * posortuj je po autorze. 2)Napisz komparatory do sortowania ksiązek po ilości
 * stron oraz po cenie i tytule. 3)Napisz klasę testującą cały program.
 */

final public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Człowiek w poszukiwaniu sensu", "Viktor Frankl", 224, 20.15);
        Book book2 = new Book("Historia sztuki w zarysie", "Karol Estreicher", 603, 32.40);
        Book book3 = new Book("Nie tłumacz się działaj!", "Brian Tracy", 247, 22.74);
        Book book4 = new Book("Atomowe nawyki", "James Clear", 285, 27.78);
        Book book5 = new Book("FUTU.RE", "Dmitrij Głuchowski", 635, 26.08);
        Book book6 = new Book("Nowy wspaniały świat", "Aldous Huxley", 256, 20.18);

        Book test_book1 = new Book("Człowiek w poszukiwaniu sensu", "Viktor Frankl", 224, 20.15); // equal true

        List<Book> list = new ArrayList<>();
        list.addAll(Arrays.asList(book1, book2, book3, book4, book5, book6));

        System.out.println("Sort by number of author: (from a to z)");
        Collections.sort(list);
        for (Book el : list) {
            System.out.println(el);
        }

        System.out.println("\nSort by number of author: (form z to a)");
        Collections.sort(list, Collections.reverseOrder());
        for (Book el : list) {
            System.out.println(el);
        }

        System.out.println("\nSort by number of pages:");
        Collections.sort(list, new CompPage());
        for (Book el : list) {
            System.out.println(el);
        }

        System.out.println("\nSort by number of price:");
        Collections.sort(list, new CompPrice());
        for (Book el : list) {
            System.out.println(el);
        }

        System.out.println("\nSort by number of titile:");
        Collections.sort(list, new CompTitle());
        for (Book el : list) {
            System.out.println(el);
        }

    }
}