// 16.Napisz metodę, która odczytuje a i n i zwraca a do potęgi n.

import java.util.Scanner;

public class task16 {
    public static double power(double number, int power) {
        double result = 1.0;
        for (int i = 0; i < power; i++)
            result = result * number;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to exponentiate: ");
        double number = scanner.nextDouble();
        System.out.println("Power: ");
        int power = scanner.nextInt();

        System.out.println("Result: " + power(number, power));

    }
}