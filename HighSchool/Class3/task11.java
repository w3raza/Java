import java.util.Scanner;
import java.util.Stack;

// 11.Korzystając ze Stosu, napisz funkcję, która odczytuje daną liczbę i zwraca
// liczbę zapisaną w systemie dwójkowym. Argumentem funkcji jest liczba
// całkowita(int), zwróconym wynikiem ciąg znaków (String).

//11. Korzystając ze Stosu,napisz funkcję,która odczytuje daną liczbę 
//i zwraca liczbę zapisaną w systemie dwójkowym.Argumentem funkcji jest liczba całkowita(int),
//zwróconym wynikiem ciąg znaków(String).

public class task11 {

    private static Scanner scanner = new Scanner(System.in);

    public static String intToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binar = new StringBuilder();

        while (number > 0) {
            stack.add(number % 2);
            number = number / 2;
        }

        while (!stack.isEmpty())
            binar.append(stack.pop());

        return binar.toString();
    }

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(intToBinary(number));

        scanner.close();
    }
}