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
        return Re+ "+" +Im+"i";
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

    public String conjugate(){
        this.Im = (-1.0)*Im;
        
        return Im +"i";
    }

    public String opposite(){
        this.Im = (-1.0)*Im;
        this.Re = (-1.0)*Re;

        return Double.toString(Re) + Double.toString(Im) +"i";
    }
}