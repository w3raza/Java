import java.util.Scanner;

//Napisz program, który wczytuje wiek i sprawdza czy osoba jest pełnoletnia.

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        Integer age = scanner.nextInt();
        if (age > 18)
            System.out.println("you are of legal age");
        else
            System.out.println("you are underage");
    }
}