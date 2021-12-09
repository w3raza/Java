public enum Option{
    RESET('0', "Board reset", null),
    LEFT('l', "Move left", Direction.LEFT), 
    RIGHT('r', "Move right", Direction.RIGHT), 
    UP('u', "Move up", Direction.UP), 
    DOWN('d', "Move down", Direction.DOWN), 
    EXIT('q', "End of the game", null);

    private char character;
    private String description;
    private Direction direction;

    public char getcharacter(){
        return character;
    }

    public String getDescription(){
        return description;
    }

    public Direction getDirection(){
        return direction;
    }

    Option(char character, String description, Direction direction)
    {
        this.character = character;
        this.description=description;
        this.direction = direction;
    }

     public String toString(){
         String string ="";
         if(direction==null)
         return character + " ==> option " + description + ", description: " + description;
         else
         return character + " ==> option " + description + ", description: " + description + ", displacement vector:" + direction;
     }
}