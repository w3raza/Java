// 9.Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na poprawnie wprowadzone hasło.

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inscription = "";
        String password = "password123";

        while (!inscription.equals(password))
            inscription = scanner.nextLine();

        System.out.println("the correct password has been entered");
    }
}
