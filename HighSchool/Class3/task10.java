import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// 10.Napisz program, który doda 100 000 elementów do ArrayList i sprawdzi
// wydajność wyświetlania jej elementów przy użyciu różnych pętli for (int
// i=0,...), foreach, Iterator

public class task10 {
    private static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer tester;

        for (int i = 0; i < 1e5; i++)
            list.add(random.nextInt(100));

        // FOR
        long startFor = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            tester = list.get(i);
        }
        long stopFor = System.nanoTime();

        // FOREACH
        long startForEach = System.nanoTime();
        for (var i : list) {
            tester = i;
        }
        long stopForEach = System.nanoTime();

        // ITERATOR
        long startIter = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            tester = iterator.next();
        long stopIter = System.nanoTime();

        System.out.println("For: " + (stopFor - startFor) + " nanoseconds");
        System.out.println("ForEach: " + (stopForEach - startForEach) + " nanoseconds");
        System.out.println("Iterator: " + (stopIter - startIter) + " nanoseconds");
    }
}