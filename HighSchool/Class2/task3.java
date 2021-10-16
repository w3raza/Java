//Napisz program, który sprawdza czy liczba wprowadzone przez użytkownika jest podzielna przez 4.

public class task3 {
    public static void main(String[] args) {

        if (Integer.valueOf(args[0]) % 4 == 0)
            System.out.println("True, is divisible by four");
        else
            System.out.println("False, is not divisible by four");
    }
}