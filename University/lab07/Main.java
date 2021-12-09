import java.util.Scanner;

public class Main{
    public static void print(){
        System.out.print("Wybierz opcje: ");
    }

    public static void main(String[] args){
        Board board = new Board(4,6,0.3);

        Scanner scanner = new Scanner(System.in);
        boolean choice =true;
        String opcja;       

        System.out.println("Dostepne opcje:");

        while(choice){
            for(Option op: Option.values())
            {System.out.println(op);}
            
            System.out.println(board);
            print();
            opcja = scanner.nextLine();

        switch(opcja){
            case "0": 
                board.reset();
            break;

            case "l":
                board.move(Option.LEFT.getDirection());
            break;

            case "r":
                board.move(Option.RIGHT.getDirection());
            break;

            case "u":
                board.move(Option.UP.getDirection());
            break;

            case "d":
                board.move(Option.DOWN.getDirection());
            break;

            case "q":
            choice = false;
            break;
           
        }
    }
    }
}


// Dostepne opcje:
// '0' ==> opcja RESET, opis: Reset planszy
// 'l' ==> opcja LEFT, opis: Przesun w lewo, wektor przesuniecia: [-1,  0]
// 'r' ==> opcja RIGHT, opis: Przesun w prawo, wektor przesuniecia: [1,  0]
// 'u' ==> opcja UP, opis: Przesun w gore, wektor przesuniecia: [0,  1]
// 'd' ==> opcja DOWN, opis: Przesun w dol, wektor przesuniecia: [0,  -1]
// 'q' ==> opcja EXIT, opis: Zakonczenie gry

// XXX XX
// XX  XX
// Xo X X
// XXXXXX

// Wybierz opcje: r

// XXX XX
// XX  XX
// X oX X
// XXXXXX

// Wybierz opcje: r
// NIE UDALO SIE WYKONAC TAKIEGO RUCHU.

// XXX XX
// XX  XX
// X oX X
// XXXXXX

// Wybierz opcje: u

// XXX XX
// XXo XX
// X  X X
// XXXXXX

// Wybierz opcje: r

// XXX XX
// XX oXX
// X  X X
// XXXXXX

// Wybierz opcje: u

// XXXoXX
// XX  XX
// X  X X
// XXXXXX

// GRATULACJE, WYGRALES!
