// Napisz program, który doda 100 000 elementów "a" do Stringa i tyle samo do
// StringBuildera i sprawdzi czas działania obu operacji

public class task9 {
    public static void main(String[] args) {
        String string1 = new String();
        StringBuilder string2 = new StringBuilder();

        long start1 = System.nanoTime();
        for (int i = 0; i < 1e5; i++) {
            string1 = string1 + "a";
        }
        long stop1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (int i = 0; i < 1e5; i++) {
            string2.append("a");
        }
        long stop2 = System.nanoTime();

        System.out.println("It took " + (stop1 - start1) + " nanoseconds to add a string to the String");
        System.out.println("It took  " + (stop2 - start2) + " nanoseconds to add a string to the StringBuilder");
    }
}
