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

            // wype??nienie kolekcji wszystkimi elementami tablicy t1
            System.out.println("Wype??nienie kolekcji wszystkimi elementam");
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

            // wyszukanie w kolekcji wszystkich element??w tablicy t2
            System.out.println("Wyszukanie w kolekcji wszystkich element??w tablicy t2");
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

            // wyszukanie w kolekcji wszystkich element??w tablicy t3
            System.out.println("Wyszukanie w kolekcji wszystkich element??w tablicy t3");
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

            // Czasy przej??cia przez trzy r????ne sposoby p??tli dla ArrayList:
            System.out.println("Czasy przej??cia przez trzy r????ne sposoby p??tli dla ArrayList:");
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

            // Czasy przej??cia przez trzy r????ne sposoby p??tli dla LinkedList:
            System.out.println("Czasy przej??cia przez trzy r????ne sposoby p??tli dla LinkedList:");
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

            // usuni??cie wszystkich element??w z kolekcji (naraz)
            System.out.println("Usuni??cie wszystkich element??w z kolekcji");
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
// Prosz?? napisa?? program obs??uguj??cy dwa parametry wywo??ania: liczby ca??kowite
// n oraz m (n > m).

// (1 pkt.) Utw??rz trzy tablice ??a??cuch??w:
// t1 -- n-elementowa tablica losowych ??a??cuch??w (??a??cuchy powinny sk??ada?? si?? z
// ma??ych i du??ych liter; d??ugo???? ka??dego ??a??cucha niech b??dzie losowa z
// przedzia??u [5,20]).
// t2 -- tablica utworzona z m ??a??cuch??w wylosowanych z t1.
// t3 -- tablica utworzona z m losowych ??a??cuch??w, niewyst??puj??cych w tablicy
// t1.
// Utw??rz cztery puste kolekcje dla typu String: ArrayList, LinkedList, TreeMap,
// oraz HashMap. Nast??pnie dla ka??dej z kolekcji policz i por??wnaj czas, kt??ry
// zajmie:
// (2 pkt.) wype??nienie kolekcji wszystkimi elementami tablicy t1 (prosz??
// wype??nia?? po jednym elemencie); w przypadku map niech to b??d?? klucze,
// (2 pkt.) wyszukanie w kolekcji wszystkich element??w tablicy t2,
// (2 pkt.) wyszukanie w kolekcji wszystkich element??w tablicy t3,
// (1 pkt.) usuni??cie wszystkich element??w z kolekcji (naraz).
// Obliczanie czasu: np. metoda nanoTime().
// (2 pkt.) Dodatkowo dla kolekcji ArrayList oraz LinkedList (przed usuni??ciem
// ich element??w :) ) prosz?? zmierzy?? i por??wna?? czas, kt??ry zajm?? trzy r????ne
// sposoby przej??cia po wszystkich elementach:
// zwyk??a p??tla for po indeksach (+ metoda get),
// p??tla for-each,
// p??tla z iteratorem.
// Niech p??tle nie robi?? nic poza wyci??gni??ciem referencji do ka??dego z
// element??w (??eby nie zaburzy?? pomiaru czasu)