import java.util.*;

public class Consumer extends Thread{
    private Bufor bufor;

    Consumer(Bufor bufor){
        this.bufor= bufor;
    }
    
    public void run() 
    {
        try {
            while(true){
            bufor.get();
            Thread.sleep((int)(Math.random() * 10000));
            }
        } 
        catch(InterruptedException e) {
            System.out.println("WatekT przerwany!");
        }
    }
}