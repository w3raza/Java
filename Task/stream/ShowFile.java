import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ShowFile{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path");
        String filePath  = scanner.nextLine();

        String text="";
        String lastline="";
        int counter = 0;
        BufferedReader inputStream = null;
        
        try {
            inputStream = new BufferedReader(new FileReader(filePath));
            while(lastline!=null){  
                text += lastline + '\n';
                lastline = inputStream.readLine();
                counter++;         
            }
        } finally {
          if (inputStream != null) {
              inputStream.close();
          }
        }
        System.out.println(text);
        System.out.println("Number od line: " + (counter-1));
        
    }
}