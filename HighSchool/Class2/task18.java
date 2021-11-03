// 18.Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // draw numbers
        System.out.print("Enter number of draw" + "\n" + "n = ");
        Integer n = Integer.valueOf(scanner.nextLine());
        System.out.print("Type a range" + "\n" + "min = ");
        Integer min = Integer.valueOf(scanner.nextLine());
        System.out.print("max = ");
        Integer max = Integer.valueOf(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < n; i++) {
            list.add(generator.nextInt(max - min) + min);
            System.out.println(list.get(i));
        }

        // the minimum and maximum of the array
        int maxVal = list.get(0);
        int minVal = list.get(0);

        for (int i = 1; i < n; i++) {
            if (maxVal < list.get(i))
                maxVal = list.get(i);
            if (minVal > list.get(i))
                minVal = list.get(i);
        }

        System.out.println("minVal= " + minVal + ", maxVal= " + maxVal);
        scanner.close();
    }
}