public class OptionNotRecognizedException extends Exception{
   private String string;
   
    OptionNotRecognizedException(String string){
        this.string=string;
    }
    
    public String toString(){
        return string;
    }
}