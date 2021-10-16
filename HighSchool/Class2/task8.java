import java.util.Scanner;

// 8.Napisz program, który wypisuje co trzecią literę podanego wyrazu.

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inscription = scanner.nextLine();

        for (int i = 0; i < inscription.length() - 1; i += 3) {
            System.out.print(inscription.charAt(i));
        }
        System.out.println();
    }
}
