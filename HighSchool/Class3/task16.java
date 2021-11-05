import java.util.*;

// 16.Napisz program, kóry pokaże różnicę w sposobie zapisu elementów do
// HashMapy, LinkedHashMapy i TreeMapy.

public class task16 {
    public static void testMap(Map<Integer, String> map) {
        String string = "count: ";
        for (int i = 0; i < 10; i++) {
            map.put(i, string + i);
        }
        System.out.println(map + "\n");
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        System.out.println("HashMap:");
        testMap(hm);
        System.out.println("LinkedHashMap:");
        testMap(lhm);
        System.out.println("TreeMap:");
        testMap(tm);
    }
}