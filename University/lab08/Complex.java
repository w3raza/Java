import static java.lang.Math.*;

public class Complex{

    private double Re;
    private double Im;

    Complex(){
        this.Re = 0.0;
        this.Im = 0.0;
    }
    Complex(double Re){
        this.Re=Re;
        this.Im = 0.0;
    }
    Complex(double Re, double Im){
        this.Re=Re;
        this.Im=Im;
    }

    public String toString(){
        if (this.Im >= 0) {
            return "" + this.Re + " + " + this.Im + "i";
        } else {
            return "" + this.Re + " - " + Math.abs(this.Im) + "i";
        }
    }

    public void set(double Re, double Im){
        this.Re=Re;
        this.Im=Im;
    }

    public void setRe(double Re){
        this.Re=Re;
    }

    public double getRe(){
        return Re;
    }

    public void setIm(double Im){
        this.Im=Im;
    }

    public double getIm(){
        return Im;
    }

    public double mod(){
        double modZ=Math.sqrt(Re*Re+Im*Im);
        //return Double.toString(modZ);
        return modZ;
    }

    public Coplex conjugate(){     
        return new Complex(this.Re, -this.Im);
    }

    public Complex opposite(){
        return new Complex(-this.Re, -this.Im);
    }

    //dodawania
    public static Complex add(Complex complex1, Complex complex2) {
        return new Complex(complex1.Re + complex2.Re, complex1.Im + complex2.Im);

    }

    public static Complex add(double complex1,  Complex complex2) {
        Complex complex3 = new Complex(complex1);
        return Complex.add(complex3, complex2);
    }

    public static Complex add(Complex complex1, double complex2) {
        Complex complex3 = new Complex(complex2);
        return Complex.add(complex1, complex3);
    }

    //odejmowanie
    public static Complex minus(Complex a, Complex b) {
        return new Complex(a.re - b.re, a.im - b.im);

    }

    public static Complex minus(double a, Complex b) {
        Complex c = new Complex(a);
        return Complex.minus(c, a);
    }

    public static Complex minus(Complex a, double b) {
        Complex c = new Complex(b);
        return Complex.minus(a, c);
    }

    //mnozenie
    public static Complex multiply(Complex a, Complex b) {
        return new Complex(a.re * b.re - a.im * b.im, a.re * b.im + a.im * b.re);

    }

    public static Complex multiply(double a, Complex b) {
        Complex c = new Complex(a);
        return Complex.multiply(c, b);
    }

    public static Complex multiply(Complex a, double b) {
        Complex c = new Complex(b);
        return Complex.multiply(a, c);
    }

    //dzielenie
    public static Complex divide(Complex a, Complex b) {
        return new Complex((a.re * b.re + a.im * b.im) / b.re * b.re, a.im * b.re - a.re * b.im);

    }

    public static Complex divide(double a, Complex b) {
        Complex c = new Complex(a);
        return Complex.divide(c, b);
    }

    public static Complex divide(Complex a, double b) {
        Complex c = new Complex(b);
        return Complex.divide(a, c);
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Complex complex = (Complex) obj;
        if (Double.doubleToLongBits(im) != Double.doubleToLongBits(complex.im))
            return false;
        return Double.doubleToLongBits(re) == Double.doubleToLongBits(complex.re);
    }
}