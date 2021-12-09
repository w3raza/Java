public class Main{
    public static void main(String[] args){
        Complex complex = new Complex();
        System.out.println(complex);
        Complex complex1 = new Complex(1.0);
        System.out.println(complex1);
        Complex complex2 = new Complex(1.0,1.0);
        System.out.println(complex2);

        System.out.println(complex.getRe());
        System.out.println(complex.getIm());
        complex.set(1.0,1.0);
        System.out.println(complex);
        System.out.println(complex2.mod());
        System.out.println(complex2.conjugate());
        System.out.println(complex2.opposite());
    }
}