import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        } else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Do u want multiply or add numbers\nEnter m (multiply)\nany other choice means addition");
        return scanner.next().equals("m"); // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("Enter number: ");
        return scanner.nextDouble(); // tutaj pobierz liczbę od użytkownika
    }
}