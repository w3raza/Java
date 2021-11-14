import java.util.Comparator;

public class CompHeight implements Comparator<Worker> {
    public int compare(Worker o1, Worker o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
