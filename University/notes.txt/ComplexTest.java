import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest{
    public ComplexTest(){
        System.out.println("Complex Test");
    }

    @Test
    public void testFirstConstructor(){
        String expectedResults = "0.0+0.0i";
        Complex complex = new Complex();
        assertEquals(expectedResults, complex.toString());
    }

    @Test
    public void testSecondConstructor(){
        String expectedResults = "1.0+0.0i";
        Complex complex1 = new Complex(1.0);
        assertEquals(expectedResults, complex1.toString());
    }

    @Test
    public void testThirdConstructor(){
        String expectedResults = "1.0+1.0i";
        Complex complex2 = new Complex(1.0,1.0);
        assertEquals(expectedResults, complex2.toString());
    }

    @Test
    public void testSet(){
        String expectedResults = "0.0+0.0i";

        Complex complex = new Complex();
        complex.set(0.0, 0.0);
        assertEquals(expectedResults, complex.toString());

        complex.setRe(0.0);
        assertEquals(expectedResults, complex.toString());

        complex.setIm(0.0);
        assertEquals(expectedResults, complex.toString());
    }

    @Test
    public void testGet(){
        double ReExpectedResults = 0.0;
        double ImExpectedResults = 0.0;

        Complex complex = new Complex();

        assertEquals(ReExpectedResults, complex.getRe());

        assertEquals(ImExpectedResults, complex.getIm());
    }

    @Test
    public void testMod(){
        Complex complex = new Complex();
        boolean isTrue = true;

        if(complex.mod()>=0.0)
        {isTrue = true;}
        else {isTrue=false;}

        assertTrue(isTrue);
    }

     @Test
    public void testConjugate(){
        double ReExpectedResults = 1.0;
        String ImExpectedResults = "-1.0i";

        Complex complex = new Complex(1.0,1.0);

       assertEquals(ReExpectedResults, complex.getRe());
       assertEquals(ImExpectedResults, complex.conjugate());
    }

    @Test
    public void testOposite(){
        String expectedResults = "-1.0-1.0i";

        Complex complex = new Complex(1.0,1.0);

       assertEquals(expectedResults, complex.opposite());
    }

}