import java.util.Scanner;

// Napisz program, który odczytuje tekst i sprawdza czy jest ono palindromem (wyrażenie brzmiące tak samo czytane od lewej do prawej i od prawej do lewej)

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.toLowerCase();

        if (new StringBuilder(text).reverse().toString().equals(text))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}