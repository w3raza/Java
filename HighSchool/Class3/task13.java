import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// 13.Napisz program, w którym będzie zadeklarowana lista elementów typu String,
// następnie napisz metodę, która będzie zliczać liczbę wystąpień poszczególnych
// elementów.

public class task13 {
    public static Map<String, Integer> countElement(List<String> list) {
        Map<String, Integer> temp = new HashMap<String, Integer>();
        for (var i : list) {
            if (temp.containsKey(i))
                temp.put(i, temp.get(i) + 1);
            else
                temp.put(i, 1);
        }
        return temp;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hi ");
        list.add("it ");
        list.add("'s ");
        list.add("me. ");
        list.add("Hi ");

        System.out.println(countElement(list));
    }
}