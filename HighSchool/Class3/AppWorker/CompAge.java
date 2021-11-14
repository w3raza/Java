import java.util.Comparator;

public class CompAge implements Comparator<Worker> {
    public int compare(Worker o1, Worker o2) {
        return o1.getAge() - o2.getAge();
    }
}
