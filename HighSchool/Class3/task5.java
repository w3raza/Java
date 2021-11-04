
// Sprawdź czy w tablicy jakaś liczba występuje co najmniej trzykrotnie.
import java.util.HashMap;
import java.util.Map;

public class task5 {
    public static void isThreeTimes(double[] array) {
        boolean isThreeTimes = false;
        Map<Double, Double> map = new HashMap<Double, Double>(); // *HashMap - an array of HashMap static class objects
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) // *containsKey() - returns true if this map contains a mapping for the
                                           // specified key.
                map.put(array[i], map.get(array[i]) + 1); // *get() - Returns the value to which the specified key is
                                                          // mapped
            else
                map.put(array[i], 1.0); // *put() - associates the specified value with the specified key in this map.
        }

        for (Map.Entry<Double, Double> el : map.entrySet()) { // * entrySet() - method returns a collection-view of the
                                                              // map, whose elements are of this class
                                                              // * Map.Entry - provides certain methods to access the
                                                              // entry in the Map.
            if (el.getValue() == 3) { // getValue() - returns the value for the corresponding map entry.
                System.out.println("Yes. This Number is: " + el.getKey()); // *getKey() - returns the key for the
                                                                           // corresponding map entry.
                isThreeTimes = true;
                break;
            }
        }
        if (!isThreeTimes)
            System.out.println("No");
    }

    public static void main(String[] args) {
        double array[] = { 1.3, 1.4, 15.4, 1.1, 1.1, 5.6, 1.1, 6.7, 5.4, 7.6 };
        isThreeTimes(array);
    }
}