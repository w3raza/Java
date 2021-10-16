// 11.Napisz program, w którym będzie zadeklarowana tablica dwuwymiarowa 3x3 liczb całkowitych. 
//Liczby będą dobrane losowo z przedziału od 10 do 99.Oblicz sumę elementów znajdujacych się ponad główną przekątną takiej macierzy.

import java.util.Random;

public class task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 10, max = 100, sum = 0;
        int[][] array = new int[3][3];

        for (int row = 0; row < 3; row++)
            for (int column = 0; column < 3; column++)
                array[row][column] = random.nextInt(max - min) + min;

        for (int column = 0; column < 3; column++) {
            for (int row = 0; row < 3; row++) {
                System.out.print(array[column][row] + " ");
                if (row > column)
                    sum += array[column][row];
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}