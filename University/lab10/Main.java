import java.util.Arrays;
import java.lang.Math;
import java.lang.reflect.*;


public class Main{
    public static void main(String[] args){
        
        try{
            Class<Math> mathClass = Math.class;
            String splitted[] = splitArgs(args[0]);
            Class numbers[] = new Class[splitted.length -1];
            double arglist[] = new double[splitted.length -1];
      
            if(args.length == 0){
                throw new ArrayIndexOutOfBoundsException();
            }
            else if(splitted.length >3 || splitted.length == 1){
                throw new ArithmeticException();
            }
            for(int i=0; i<splitted.length-1;i++){
                arglist[i] = Double.parseDouble(splitted[i+1]);
                numbers[i] = double.class;
            }
            Method method = mathClass.getMethod(splitted[0], numbers);

            if(numbers.length == 1){
                    System.out.println("wynik: " + method.invoke(null, arglist[0]));
            }
            else if(numbers.length == 2){
                    System.out.println("wynik: " + method.invoke(null, arglist[0], arglist[1]));
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Nie podano nic do obliczenia!");
        }
        catch(ArithmeticException e){
            System.out.println("Zla liczba argumentow funkcji! Podaj jedna lub dwie liczby.");
        }
        catch(NumberFormatException e)
        {
                System.out.println("Argumenty funkcji musza byc liczbami!");
        }
        catch(NoSuchMethodException e){
                System.out.println("Nie ma takiej metody!");
            }
        catch(IllegalAccessException | InvocationTargetException e){
                System.out.println("Metoda jest niedostpna");
        }
    }
    public static String[] splitArgs(String arg) {
        return Arrays.stream(arg.split("[\\s+(),]")).filter(w -> w.isEmpty() == false).toArray(String[]::new);
    }
}