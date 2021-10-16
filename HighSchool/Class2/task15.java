// 15.Napisz metodę, która oblicza liczbę dzielników podanej liczby.

import java.util.Scanner;

public class task15 {
    public static String divisors(int number) {
        StringBuilder sb = new StringBuilder();
        String divisor = "";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                divisor = sb.append(i).append(" ").toString();
        }

        return divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        System.out.println("Divisors: " + divisors(number));

    }
}