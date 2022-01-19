import java.util.*;

public class Producent extends Thread{
    private Bufor bufor;

    Producent(Bufor bufor){
        this.bufor= bufor;
    }
    
    public void run() 
    {
        try {
            while(true){
            bufor.put();
            Thread.sleep((int)(Math.random() * 10000));

            }
        } 
        catch(InterruptedException e) {
            System.out.println("WatekT przerwany!");
        }
    }
}