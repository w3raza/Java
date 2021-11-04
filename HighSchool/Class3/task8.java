
// Napisz program, który będzie umożliwiał tłumaczenie słów z języka polskiego
// na angielski.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task8 {
    public static void translate() {
        Scanner scanner = new Scanner(System.in);
        String string;
        String word;
        Map<String, String> mapPolishToEnglish = new HashMap<String, String>();
        Map<String, String> mapEnglishToPolish = new HashMap<String, String>();
        mapPolishToEnglish.put("kojarzyc", "associate");
        mapPolishToEnglish.put("dziedziczenie", "inherited");
        mapPolishToEnglish.put("nadrzedny", "overriding");
        mapEnglishToPolish.put("large", "wielki, duży");
        mapEnglishToPolish.put("intimidated", "onieśmielony, przestrszaony");
        mapEnglishToPolish.put("variety", "typ, odmiana, różnorodność");
        /* ... */

        do {
            System.out.println("Menu");
            System.out.println("1-Translate Polish-English");
            System.out.println("2-Translate English-Polish");
            System.out.println("0-Exit");
            string = scanner.nextLine();
            if (string.equals("1")) {
                System.out.println("Enter polish word");
                word = scanner.nextLine();
                if (mapPolishToEnglish.containsKey(word))
                    System.out.println("Translate : " + mapPolishToEnglish.get(word));
                else
                    System.out.println("No word in the dictionary");
            }
            if (string.equals("2")) {
                System.out.println("Enter english word");
                word = scanner.nextLine();
                if (mapEnglishToPolish.containsKey(word))
                    System.out.println("Translate : " + mapEnglishToPolish.get(word));
                else
                    System.out.println("No word in the dictionary");
            }
        } while (!string.equals("0"));
        scanner.close();
    }

    public static void main(String[] args) {
        translate();
    }
}