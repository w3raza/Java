import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main{
    public static void main(String[] args){

        try{
            int horizontalPosition = 0;
            int depth = 0;
            int aim = 0;
            int x;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String string, line;
            System.out.println("Podaj nazwe pliku:");
            string = br.readLine();
            Path path = Paths.get(string);

            BufferedReader reader = Files.newBufferedReader(path);
            while ((line = reader.readLine()) != null) {
                String[] tab = line.split(" ");

                if(tab[0].equals("forward")){
                   x = Integer.parseInt(tab[1]);
                   horizontalPosition += x;
                   depth += aim*x;
                }
                if(tab[0].equals("down")){
                   x = Integer.parseInt(tab[1]);
                   aim += x;
                }
                if(tab[0].equals("up")){
                   x = Integer.parseInt(tab[1]);
                   aim -= x;
                }
            }
            System.out.println("\nhorizontal position: " + horizontalPosition + "\n" + "depth: " + depth + "\n");

            BufferedWriter writer;
            Path outputPath;

            while(true){
                System.out.println("Wpisz nazwe pliku do zapisu");
                string = br.readLine();
                outputPath = Paths.get(string);
                if(Files.exists(Paths.get(string))){
                    System.out.println("Plik istnieje chcesz go nadpisac? (y/n)");
                    string = br.readLine();
                    if((!string.equals("y"))&&(!string.equals("n"))){
                        System.out.println("Musisz wpsiac y (tak nadpisz) lub n (nie nadpisuj)");
                        string = br.readLine();
                    }
                    if(string.equals("y"))
                     if (string.equals("y"))
                        break;
                    else if(string.equals("n"))
                        continue;
                    }
                else
                    break; 
            }
            writer = Files.newBufferedWriter(outputPath);
            writer.write("horizontal position: " + horizontalPosition + "\n" + "depth: " + depth);
            writer.close();
            br.close();

        }catch(IOException e){
            System.out.println("IOException: " + e);
        }    
    }
}