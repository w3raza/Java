public class WallException extends Exception{
    private String string;

    WallException(String string){
        this.string=string;
    }
    public String toString(){
        return string;
    }
}