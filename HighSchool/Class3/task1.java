//Napisz program, który sprawdza czy ciąg znaków jest palindromem.

public class task1 {
    public static void main(String[] args) {
        String inscription = args[0].toLowerCase();

        if (new StringBuilder(inscription).reverse().toString().equals(inscription))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}