import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveToFile{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path");
        String filePath  = scanner.nextLine();
        System.out.println("Enter first line of text. q - quit");
        String answer = scanner.nextLine();

        FileWriter fileWriter = null;

            try{
                fileWriter = new FileWriter(filePath);
                while(!answer.equals("q")){
                    fileWriter.write(answer);
                    fileWriter.write(System.lineSeparator());
                    answer = scanner.nextLine();
                }
            } finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
        
    }
}