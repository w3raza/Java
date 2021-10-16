//Napisz program, który odczytuje liczbę rzeczywistą i wyświetla wartość całkowitą tej liczby.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real number:");
        double wholeNumber = scanner.nextDouble();
        System.out.println("Integer: " + (int) wholeNumber);
    }
}