// 14.Napisz metodę, która stwierdza czy liczba jest pierwsza.

import java.util.Scanner;

public class task14 {
    public static boolean isPrimeNumber(int number) {
        if (number == 1)
            return false;
        else {
            for (int i = 2; i <= (int) Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter prime number");
        int number = scanner.nextInt();

        if (isPrimeNumber(number))
            System.out.println("It is prime number");
        else
            System.out.println("It is not prime number");
    }
}