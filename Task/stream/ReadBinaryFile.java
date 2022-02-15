import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadBinaryFile{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path");
        String filePath  = scanner.nextLine();
        int birthDay = 0;
        int birthMonth = 0;
        int birthYear = 0;

        DataInputStream inputFile  = null;

            try{
                inputFile  = new DataInputStream(new FileInputStream(filePath));
                birthDay = inputFile.readInt();
                birthMonth = inputFile.readInt();
                birthYear = inputFile.readInt();
            } finally {
                if (inputFile  != null) {
                    inputFile .close();
                }
            }
            System.out.println("Data urodzenia to " + birthDay + "." + birthMonth + "." + birthYear + ".");
    }
}