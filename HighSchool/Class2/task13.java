
//13.Napisz metodę, która wyznacza sumę cyfr zadanej liczby całkowitej.
import java.util.Scanner;

public class task13 {
    public static int sum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("Sum: " + sum(number));
    }
}