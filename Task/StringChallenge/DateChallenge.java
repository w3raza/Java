
// Niech funkcja StringChallenge( str ) pobierze przekazywany parametr str ,
// który będzie dwa razy (każdy prawidłowo sformatowany dwukropkiem i am lub pm)
// oddzielony myślnikiem i zwróci całkowitą liczbę minut między tymi dwoma
// czasami. Czas będzie w formacie 12-godzinnym. Na przykład: jeśli str to
// 9:00-10:00 , wynik powinien wynosić 60 . Jeśli str to 13:00-11:00 , wynik
// powinien wynosić 1320 .
// Przykłady
// Wejście: „12:30-12:00”
// Wyjście: 690
// Wejście: „1:23–1:08”
// Wyjście: 1425

import java.util.*;
import java.io.*;

class Main {

    public static String StringChallenge(String str) {
        // code goes here

        String[] splitted = str.split("-");
        System.out.println(splitted[0]);
        if (splitted[0].charAt((splitted[0].length()) - 2) == 'p') {
            String[] splitTime1 = splitted[0].split(":");
            String[] splitTime2 = splitted[1].split(":");
            Integer hour = Integer.parseInt(splitTime1[0]) + 12 - Integer.parseInt(splitTime2[0]);
            Integer minute = Integer.parseInt(splitTime1[1].charAt(0) + "" + splitTime1[1].charAt(1))
                    - Integer.parseInt(splitTime2[1].charAt(0) + "" + splitTime2[1].charAt(1));
            if (hour < 0)
                str = String.valueOf((-1) * hour * 60 - minute);
            else
                str = String.valueOf(hour * 60 - minute);
        } else {
            String[] splitTime1 = splitted[0].split(":");
            String[] splitTime2 = splitted[1].split(":");
            Integer hour = Integer.parseInt(splitTime1[0]) - Integer.parseInt(splitTime2[0]);
            Integer minute = Integer.parseInt(splitTime1[1].charAt(0) + "" + splitTime1[1].charAt(1))
                    - Integer.parseInt(splitTime2[1].charAt(0) + "" + splitTime2[1].charAt(1));
            if (hour < 0)
                str = String.valueOf((-1) * hour * 60 + minute);
            else
                str = String.valueOf(hour * 60 + minute);
        }

        return str;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}
