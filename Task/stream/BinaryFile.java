import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinaryFile{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path");
        String filePath  = scanner.nextLine();
        String[] question= {"day", "month", "year"};

        Integer answer;
        DataOutputStream output = null;

            try{
                output = new DataOutputStream(new FileOutputStream(filePath));
                for(var quest : question){
                    System.out.println("Enter " + quest + " of your birth");
                    answer = scanner.nextInt();
                    output.writeInt(answer);
                    scanner.nextLine();
                }
            } finally {
                if (output != null) {
                    output.close();
                }
            }  
    }
}