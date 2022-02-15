// // String Challenge
// // Have the function StringChallenge(str) take the str parameter being passed
// and return a compressed version of the string using the Run-length encoding
// algorithm. This algorithm works by taking the occurrence of each repeating
// character and outputting that number along with a single character of the
// repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. The string
// will not contain any numbers, punctuation, or symbols.

import java.util.*;
import java.io.*;

class Main {

    public static String StringChallenge(String str) {

        String[] splitted = str.split("(?!^)");
        str = "";
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < splitted.length; i++) {
            if (map.containsKey(splitted[i])) {
                int value = map.get(splitted[i]);
                value++;
                map.put(splitted[i], value);
            } else {
                map.put(splitted[i], 1);
            }
        }

        for (var entry : map.entrySet())
            str += entry.getKey() + entry.getValue();

        return str;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}
