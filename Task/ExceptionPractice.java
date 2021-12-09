import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionPractice{
    public static void main(String[] args){
        double number=0.0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                if(args.length>0){
                    number=Integer.parseInt(args[0]);
                    break;
                }    
                else{
                    System.out.println("Enter number: ");
                    number = scanner.nextDouble();
                    break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Wrong number!");
                scanner.next();
            }
        }

        if(number<0)
            throw new IllegalArgumentException(String.format("the root of a negative number: %g does not exist", number));

        System.out.println(String.format("The square root of %g is: %g", number, Math.sqrt(number)));
    } 
}