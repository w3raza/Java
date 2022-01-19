import java.util.*;

public class Main{
    public static void main(String[] args){
        Bufor bufor = new Bufor(2);

        new Producent(bufor).start();
        new Consumer(bufor).start();
        new Producent(bufor).start();
        new Consumer(bufor).start();
    }
}
