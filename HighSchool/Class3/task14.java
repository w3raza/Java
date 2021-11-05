import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 14.Napisz program, który wczytuje liczby z pliku. Znajduje części wspólne i
// liczby które znajdują się w pierwszym pliku , a w drugim ich nie ma.

public class task14 {

    public static void main(String[] args) throws IOException {

        List<String> list1 = Files
                .readAllLines(Paths.get("/mnt/c/Users/User/Desktop/Programowanie/Java/HighSchool/Class3/file1.txt"));
        List<String> list2 = Files
                .readAllLines(Paths.get("/mnt/c/Users/User/Desktop/Programowanie/Java/HighSchool/Class3/file2.txt"));

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        System.out.println("First file: " + set1);
        System.out.println("Second file: " + set2);

        Set<String> common = new HashSet<>(set1);
        common.retainAll(set2);
        System.out.println("Common 1+2 " + common);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference 1-2 " + difference);
    }
}