import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// 15.Napisz program, który posortuje zdefiniową tablicę. Użyj klasy TreeSet.

public class task15 {

    public static void main(String[] args) {
        Double[] arrayOfDouble = { 0.0, 0.1, 2.3, 5.6, 1.2, 2.0, 7.6, 7.4, 5.3, 0.0 };
        System.out.println("Array's size is: " + arrayOfDouble.length);

        Set<Double> treeSet = new TreeSet<Double>(Arrays.asList(arrayOfDouble));

        System.out.println(treeSet);
        System.out.println("Array's size is: " + treeSet.size());
    }
}