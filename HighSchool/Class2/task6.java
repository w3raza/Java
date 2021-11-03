
//Napisz program, który odczytuje napis i wypisuje go wspak.
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inscription = scanner.nextLine();

        for (int i = inscription.length() - 1; i >= 0; i--)
            System.out.print(inscription.charAt(i));
        System.out.println();
    }
}