import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeMap;

public class Main {

    static String getRandomString(int length) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder string = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            string.append(alphabet.charAt((int) (alphabet.length() * Math.random())));
        }
        return string.toString();
    }

    public static void main(String[] args) {

        try {
            if (args.length != 2)
                throw new ArithmeticException();

            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);

            if (n < m)
                throw new Exception();

            String[] t1 = new String[n];
            String[] t2 = new String[m];
            String[] t3 = new String[m];

            Random random = new Random();
            // inicjalizacja
            for (int i = 0; i < n; i++) {
                int size = random.nextInt(16) + 5;
                t1[i] = getRandomString(size);
            }
            for (int i = 0; i < t2.length; i++) {
                int index = random.nextInt(t1.length);
                t2[i] = t1[index];
            }
            for (int i = 0; i < t3.length; i++) {
                int size = random.nextInt(16) + 5;
                String temp = getRandomString(size);
                while (Arrays.stream(t1).anyMatch(temp::equals)) {
                    temp = getRandomString(size);
                }
                t3[i] = temp;
            }

            ArrayList<String> collection1 = new ArrayList<String>();
            LinkedList<String> collection2 = new LinkedList<String>();
            TreeMap<String, String> collection3 = new TreeMap<>();
            HashMap<String, String> collection4 = new HashMap<>();

            // wypełnienie kolekcji wszystkimi elementami tablicy t1
            System.out.println("Wypełnienie kolekcji wszystkimi elementam");
            long start = System.nanoTime();
            for (int i = 0; i < n; i++) {
                collection1.add(t1[i]);
            }
            long stop = System.nanoTime();
            System.out.println("Array List: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < n; i++) {
                collection2.add(t1[i]);
            }
            stop = System.nanoTime();
            System.out.println("Linked List: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < n; i++) {
                collection3.put(t1[i], t1[i]);
            }
            stop = System.nanoTime();
            System.out.println("Tree Map: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < n; i++) {
                collection4.put(t1[i], t1[i]);
            }
            stop = System.nanoTime();
            System.out.println("Hash Map: " + (stop - start) + " ns");
            System.out.println();

            // wyszukanie w kolekcji wszystkich elementów tablicy t2
            System.out.println("Wyszukanie w kolekcji wszystkich elementów tablicy t2");
            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection1.contains(t2[i]))
                    collection1.get(i);
            }
            stop = System.nanoTime();
            System.out.println("Array List: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection2.contains(t2[i]))
                    collection2.get(i);
            }
            stop = System.nanoTime();
            System.out.println("Linked List: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection3.containsKey(t2[i])) {
                    collection3.get(t2[i]);
                }
            }
            stop = System.nanoTime();
            System.out.println("Tree Map: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection4.containsKey(t2[i])) {
                    collection4.get(t2[i]);
                }
            }
            stop = System.nanoTime();
            System.out.println("Hash Map: " + (stop - start) + " ns");
            System.out.println();

            // wyszukanie w kolekcji wszystkich elementów tablicy t3
            System.out.println("Wyszukanie w kolekcji wszystkich elementów tablicy t3");
            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection1.contains(t3[i]))
                    collection1.get(i);
            }
            stop = System.nanoTime();
            System.out.println("Array List: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection2.contains(t3[i]))
                    collection2.get(i);
            }
            stop = System.nanoTime();
            System.out.println("Linked List: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection3.containsKey(t3[i])) {
                    collection3.get(t3[i]);
                }
            }
            stop = System.nanoTime();
            System.out.println("Tree Map: " + (stop - start) + " ns");

            start = System.nanoTime();
            for (int i = 0; i < m; i++) {
                if (collection4.containsKey(t3[i])) {
                    collection4.get(t3[i]);
                }
            }
            stop = System.nanoTime();
            System.out.println("Hash Map: " + (stop - start) + " ns");
            System.out.println();

            // Czasy przejścia przez trzy różne sposoby pętli dla ArrayList:
            System.out.println("Czasy przejścia przez trzy różne sposoby pętli dla ArrayList:");
            // petla for
            start = System.nanoTime();
            for (int i = 0; i < collection1.size(); i++) {
                collection1.get(i);
            }
            stop = System.nanoTime();
            System.out.println("Petla for: " + (stop - start) + " ns");

            // petla for-each
            start = System.nanoTime();
            for (String s : collection1) {
            }
            stop = System.nanoTime();
            System.out.println("Petla for-each: " + (stop - start) + " ns");

            // petla z iteratorem
            start = System.nanoTime();
            for (Iterator i = collection1.iterator(); i.hasNext();) {
                i.next();
            }
            stop = System.nanoTime();
            System.out.println("Petla z iteratorem: " + (stop - start) + " ns");
            System.out.println();

            // Czasy przejścia przez trzy różne sposoby pętli dla LinkedList:
            System.out.println("Czasy przejścia przez trzy różne sposoby pętli dla LinkedList:");
            // petla for
            start = System.nanoTime();
            for (int i = 0; i < collection2.size(); i++) {
                collection2.get(i);
            }
            stop = System.nanoTime();
            System.out.println("Petla for: " + (stop - start) + " ns");

            // petla for-each
            start = System.nanoTime();
            for (String s : collection2) {
            }
            stop = System.nanoTime();
            System.out.println("Petla for-each: " + (stop - start) + " ns");

            // petla z iteratorem
            start = System.nanoTime();
            for (Iterator i = collection2.iterator(); i.hasNext();) {
                i.next();
            }
            stop = System.nanoTime();
            System.out.println("Petla z iteratorem: " + (stop - start) + " ns");
            System.out.println();

            // usunięcie wszystkich elementów z kolekcji (naraz)
            System.out.println("Usunięcie wszystkich elementów z kolekcji");
            start = System.nanoTime();
            collection1.clear();
            stop = System.nanoTime();
            System.out.println("Array List: " + (stop - start) + " ns");

            start = System.nanoTime();
            collection2.clear();
            stop = System.nanoTime();
            System.out.println("Linked List: " + (stop - start) + " ns");

            start = System.nanoTime();
            collection3.clear();
            stop = System.nanoTime();
            System.out.println("Tree Map: " + (stop - start) + " ns");

            start = System.nanoTime();
            collection4.clear();
            stop = System.nanoTime();
            System.out.println("Hash Map: " + (stop - start) + " ns");

        } catch (ArithmeticException e) {
            System.out.println("Zla liczba argumentow funkcji. Podaj dwa argumenty!");
        } catch (Exception e) {
            System.out.println("Liczba m nie moze byc wieksza od n!");
        }

    }
}
// Proszę napisać program obsługujący dwa parametry wywołania: liczby całkowite
// n oraz m (n > m).

// (1 pkt.) Utwórz trzy tablice łańcuchów:
// t1 -- n-elementowa tablica losowych łańcuchów (łańcuchy powinny składać się z
// małych i dużych liter; długość każdego łańcucha niech będzie losowa z
// przedziału [5,20]).
// t2 -- tablica utworzona z m łańcuchów wylosowanych z t1.
// t3 -- tablica utworzona z m losowych łańcuchów, niewystępujących w tablicy
// t1.
// Utwórz cztery puste kolekcje dla typu String: ArrayList, LinkedList, TreeMap,
// oraz HashMap. Następnie dla każdej z kolekcji policz i porównaj czas, który
// zajmie:
// (2 pkt.) wypełnienie kolekcji wszystkimi elementami tablicy t1 (proszę
// wypełniać po jednym elemencie); w przypadku map niech to będą klucze,
// (2 pkt.) wyszukanie w kolekcji wszystkich elementów tablicy t2,
// (2 pkt.) wyszukanie w kolekcji wszystkich elementów tablicy t3,
// (1 pkt.) usunięcie wszystkich elementów z kolekcji (naraz).
// Obliczanie czasu: np. metoda nanoTime().
// (2 pkt.) Dodatkowo dla kolekcji ArrayList oraz LinkedList (przed usunięciem
// ich elementów :) ) proszę zmierzyć i porównać czas, który zajmą trzy różne
// sposoby przejścia po wszystkich elementach:
// zwykła pętla for po indeksach (+ metoda get),
// pętla for-each,
// pętla z iteratorem.
// Niech pętle nie robią nic poza wyciągnięciem referencji do każdego z
// elementów (żeby nie zaburzyć pomiaru czasu)