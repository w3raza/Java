// 12.Napisz metodę, która sprawdzi czy z trzech podanych długości boków można zbudować trójkąt a następnie obliczy jego pole.

import java.util.Scanner;

public class task12 {
    public static boolean isTriangle(double[] array) {
        return (array[0] < (array[1] + array[2]) && array[1] < (array[0] + array[2])
                && array[2] < (array[1] + array[0]));
    }

    public static double calculateTheField(double[] array) {
        double p = (array[0] + array[1] + array[2]) / 2;
        return Math.sqrt(p * (p - array[0]) * (p - array[1]) * (p - array[2]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[3];
        int i = 0;

        System.out.println("Enter three side lengths");
        do {
            array[i] = scanner.nextDouble();
            i++;
        } while (i < 3);
        if (isTriangle(array))
            System.out.println("Field: " + calculateTheField(array));
        else
            System.out.println("You cannot build a triangle from these side lengths");
    }
}