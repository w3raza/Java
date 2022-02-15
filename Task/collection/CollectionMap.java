import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CollectionMap{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("Eneter name:(enter q to finish)");
        String string = scanner.nextLine();
        String previousString;

        while(!string.equals("q")){
            previousString = string;
            string = scanner.next();
            map.put(previousString, string);
        }
        
        if(!map.isEmpty()){
            System.out.println("Number of names = " + map.size());
            System.out.println("Enter name of partner: ");
            string = scanner.next();
            System.out.println("Your partner is: " + map.get(string));
        }
    }
}