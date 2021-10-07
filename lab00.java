//Proszę napisać program, który przyjmuje jako argumenty wywołania programu wartości całkowite n, min, max.
// Następnie należy wylosować n liczb całkowitych z zakresu [min, max], wyświetlić je oraz znaleźć i wyświetlić:
//        stosunek liczb dodatnich do ujemnych,
//        najmniejszą z wylosowanych wartości,
//        największą z wylosowanych wartości.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class lab00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        int maxVal = list.get(0);
        int minVal = list.get(0);
        float sumNegative = 0.0f;
        float sumPostive = 0.0f;

        for (int i = 1; i < n; i++) {
            if (maxVal < list.get(i))
                maxVal = list.get(i);
            if (minVal > list.get(i))
                minVal = list.get(i);
            if (list.get(i) < 0)
                sumNegative++;
            else
                sumPostive++;
        }

        System.out.println("Suma= " + sumNegative + "Suma= " + sumPostive);
        System.out.println(
                "Positive/negative= " + (sumPostive / sumNegative) + ", minVal= " + minVal + ", maxVal= " + maxVal);
    }
}