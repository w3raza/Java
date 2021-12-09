public enum Option{
    RESET('0', "Reset planszy", null),
    LEFT('l', "Przesun w lewo", Direction.LEFT), 
    RIGHT('r', "Przesun w prawo", Direction.RIGHT), 
    UP('u', "Przesun w gore", Direction.UP), 
    DOWN('d', "Przesun w dol", Direction.DOWN), 
    EXIT('q', "Zakonczenie gry", null);

    private final char znak;
    private final String opis;
    private final Direction direction;

    public char getZnak(){
        return znak;
    }

    public String getOpis(){
        return opis;
    }

    public Direction getDirection(){
        return direction;
    }

    Option(char znak, String opis, Direction direction)
    {
        this.znak = znak;
        this.opis=opis;
        this.direction = direction;
    }

     public String toString(){
        if(direction==null)
           return znak + " ==> opcja " + opis + ", opis: " + opis;
        else
           return znak + " ==> opcja " + opis + ", opis: " + opis + ", wektor przesuniecia: [" + direction + "]";
     }
}