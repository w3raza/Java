import java.util.Comparator;

public class CompPage implements Comparator<Book> {
    public int compare(Book o1, Book o2) {
        return o1.getPage() - o2.getPage();
    }
}
