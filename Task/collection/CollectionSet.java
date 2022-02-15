import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<String>();

        System.out.println("Eneter name:(enter q to finish)");
        String string = scanner.next();

        while(!string.equals("q")){
            set.add(string);
            string = scanner.next();
        }

        System.out.println("Number of names = " + set.size());

        for(var name: set){
            System.out.println(name);
        }
    }
}