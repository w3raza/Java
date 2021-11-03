import java.util.Scanner;

// Napisz program, który wczytuje od użytkownika ciąg znaków i wypisuje ostatnią literę.
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string of characters");
        String stringOfCharacters = scanner.nextLine();
        System.out.println("Last character: " + stringOfCharacters.charAt(stringOfCharacters.length() - 1));
    }
}