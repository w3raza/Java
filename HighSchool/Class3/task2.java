// Napisz program, który sprawdza czy podany wyraz jest poprawnym kodem pocztowym

import java.util.Scanner;
import java.util.regex.Pattern; //pattern matches - metoda zwraca true jeśli łańcuch znaków pasuje w całości do wyrażenia regularnego

public class task2 {
    public static boolean checkPostCode(String postCode) {
        if ((postCode.length() == 6) && postCode.charAt(2) == '-' && Character.isDigit(postCode.charAt(0))
                && Character.isDigit(postCode.charAt(1)) && Character.isDigit(postCode.charAt(3))
                && Character.isDigit(postCode.charAt(4)) && Character.isDigit(postCode.charAt(5))
                && Pattern.matches("[0-9]{2}-[0-9]{3}", postCode))
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter post code");
        String postCode = scanner.nextLine();

        if (checkPostCode(postCode))
            System.out.println("It is ok");
        else
            System.out.println("Wrong!");
        scanner.close();
    }
}