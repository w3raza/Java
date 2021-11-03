// 19.Napisz program, który wyznaczy ilość wystąpień liczby k w podanym ciągu liczb.

public class task19 {
    public static void main(String[] args) {
        double k = 1.3;
        double[] array = { 1.3, 3.5, 3.4, 1.4, 1.3, 5, 8.9, 1.3 };
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == (k))
                counter++;
        }
        System.out.println("The number of occurrences of a number " + k + ": " + counter);
    }
}