// Znajdz liczbę z przedziału 2 do 10000, która ma największą liczbę dzielników

public class task7 {
    public static int countDividors(int number) {
        int counter = 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                counter++;
        }
        return counter;
    }

    public static void theLargestNumberOfDivisors() {
        int max = 2, elMax = 2;
        for (int i = 2; i < 10000; i++) {
            if (countDividors(i) > max) {
                max = countDividors(i);
                elMax = i;
            }
        }
        System.out.println("The number: " + elMax + " have the largest number of divisor " + max);

    }

    public static void main(String[] args) {
        theLargestNumberOfDivisors();
    }
}