import java.util.ArrayList;
import java.util.List;

// 12.Napisz program, w którym będzie zadeklarowana lista elementów typu String,
// następnie napisz metodę która będzie sprawdzać czy występują w niej
// powtarzające się elementy.

public class task12 {
    public static String isRepeatable(List<String> list) {
        int i = 0;
        String ele;

        while (!list.isEmpty()) {
            ele = list.get(i);
            list.remove(i);
            if (list.contains(ele))
                return ele;
            i++;
        }
        return null;
    }

    public static void main(String[] args) {
        String ele;

        List<String> list = new ArrayList<>();
        list.add("Hi ");
        list.add("it ");
        list.add("'s ");
        list.add("me. ");
        list.add("Hi ");

        if ((ele = isRepeatable(list)) != null)
            System.out.println("It repeat: " + ele);
        else
            System.out.println("It not repeat.");
    }
}