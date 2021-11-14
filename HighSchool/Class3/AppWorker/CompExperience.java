import java.util.Comparator;

public class CompExperience implements Comparator<Worker> {

    public int compare(Worker o1, Worker o2) {
        // System.out.println("Data: " + date + " " + month + " " + year);
        if (!o2.getYear().equals(o1.getYear()))
            return (o2.getYear() - o1.getYear());
        else if (!o2.getMonth().equals(o1.getMonth()))
            return ((o2.getYear() + o2.getMonth()) - (o1.getYear() + o1.getMonth()));
        else
            return ((o2.getYear() + o2.getMonth() + o2.getDate()) - (o1.getYear() + o1.getMonth()) + o1.getDate());

    }
}
