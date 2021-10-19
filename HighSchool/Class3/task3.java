// Napisz program, który oblicza liczbę małych liter w podanym wyrazie.

import java.util.Scanner;

public class task3 {
    public static int lowercaseLetters(String letter) {
        int sum = 0;
        for (int i = 0; i < letter.length(); i++) {
            if (Character.isLowerCase(letter.charAt(i)))
                sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence. I will check the number of lowercase letters for you.");
        String letter = scanner.nextLine();

        System.out.println("Number of lowercase letters: " + lowercaseLetters(letter));

        scanner.close();
    }
}