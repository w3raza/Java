import java.util.*;

public class Bufor{
    private int size = 0;
    private int capacity;

    Bufor(int capacity){
        this.capacity = capacity;
    }

    synchronized void put(){
        System.out.println("Rozpoczynam dodawanie elementu do bufora. Producent: Thread[Thread-" + Thread.currentThread() + ",5,main]");
        while(size == capacity){
            System.out.println("Bufor pełny. Czekam na zabranie elementu...");
            try { 
                wait(); 
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        size++;
        notifyAll();
        System.out.println("Dodano element do bufora. Zajetosc: " + size + "/" + capacity);
    }
    synchronized void get(){
        System.out.println("Rozpoczynam wyjmowanie - Thread[Thread-" + Thread.currentThread() + ",5,main]");
        while(size==0){
            System.out.println("Bufor jest pusty. Czekam na dodanie elementu...");
            try { 
                wait(); 
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        size--;
        notifyAll();
        System.out.println("Zabrano element z bufora. Zajetosc: " + size + "/" + capacity);
    }
}