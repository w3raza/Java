public class Main{
    public static void main(String[] args){
        BoxGeneric<String> data = new BoxGeneric<String>( "gen" );
        System.out.println( data.objType() );
        String s = data.get();
        // int k = data.get(); /* BLAD kompilacji */
        System.out.println("s = [" + s + "]");
    }
}