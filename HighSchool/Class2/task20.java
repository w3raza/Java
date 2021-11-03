// 20.Napisz program TOTOLOTEK, który losuje 6 liczb z przedziału <1,49> Liczby nie mogą sie powtarzać.

import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

public class task20 {
    public static void main(String[] args) {
        Integer n = 15;
        Integer min = 1;
        Integer max = 49;

        Set<Integer> set = new TreeSet<Integer>();
        Random random = new Random();

        while (set.size() != n)
            set.add(random.nextInt(max + min) + min);
        System.out.print("The drawn numbers are: " + set);
        System.out.println();
    }
}