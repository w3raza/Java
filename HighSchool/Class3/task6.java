
// Jest dana tablica 10 liczb całkowitych. Sprawdź ile jest różnych reszt z
// dzielenia tych liczb przez 37.
import java.util.HashMap;
import java.util.Map;

public class task6 {
    public static void residualsFromDividing(int[] array) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // *HashMap - an array of HashMap static class
                                                                     // objects
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i] % 37)) // *containsKey() - returns true if this map contains a mapping for the
                                                // specified key.
                map.put(array[i] % 37, map.get(array[i] % 37) + 1); // *get() - Returns the value to which the specified
                                                                    // key is mapped
            else
                map.put(array[i] % 37, 1); // *put() - associates the specified value with the specified key in this
                                           // map.
        }
        System.out.println(map.size());
    }

    public static void main(String[] args) {
        int array[] = { 67, 43, 2, 12, 67, 76, 34, 98, 23, 210 };
        residualsFromDividing(array);
    }
}