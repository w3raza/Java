// 17.Napisz metodę, którą wczytuje n liczb do tablicy, a następnie wypisuje je w odwrotnej kolejności.

import java.util.Scanner;

public class task17 {

    public static void revers(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[n];

        System.out.println("Eneter number");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextInt();
        }

        System.out.print("Items in reverse order: ");
        for (int i = tablica.length - 1; i >= 0; i--)
            System.out.print(tablica[i] + " ");

        System.out.println();
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of elements");
        int n = scanner.nextInt();
        revers(n);

        scanner.close();
    }
}