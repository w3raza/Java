import java.util.*;

public class Main{

    public static void wypisz(Board board){
        System.out.println("Choose options: ");
        for(Option op: Option.values())
            {System.out.println(op);}

        System.out.println(board);
    }

    public static void main(String[] args){
        int sizeBoard =0;

        while(true){
            try{
                System.out.println("Enetr size of board:");
                sizeBoard= SystemInWrapper.sc.nextInt();
                SystemInWrapper.sc.nextLine(); 
                if(sizeBoard<2)
                    {throw new Exception();}
                else 
                    break;
            }catch(InputMismatchException e){
                System.out.println("ERROR: Enter an integer!");
                SystemInWrapper.sc.nextLine();
                
            }catch(Exception e){
                System.out.println(String.format("ERROR: Too little value sizeBoard: %d!", sizeBoard));
                
            }
        }

        Board board = new Board(sizeBoard, sizeBoard);

        boolean choice =true;
        String opcja; 
        
        try{
            while(choice){
                wypisz(board);
                opcja = SystemInWrapper.sc.nextLine(); 
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
                    default:
                        throw new OptionNotRecognizedException("Unexpected char");
                }
            }   
        }catch(OptionNotRecognizedException e){
            System.out.println(e);
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
