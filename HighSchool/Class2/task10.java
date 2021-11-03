
// 10.Napisz program, który wczytuje od użytkownika cztery liczby i umieszcze je w tablicy dwuwymiarowej. Następnie oblicza wyznacznik.
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[2][2];

        System.out.println("Enter four numbers");

        for (int row = 0; row < 2; row++)
            for (int column = 0; column < 2; column++)
                array[row][column] = scanner.nextInt();

        for (int column = 0; column < 2; column++) {
            for (int row = 0; row < 2; row++)
                System.out.print(array[column][row] + " ");
            System.out.println();
        }

        int determinant = array[0][0] * array[1][1] - array[0][1] * array[1][0];
        System.out.println("Determinant: " + determinant);
    }
}