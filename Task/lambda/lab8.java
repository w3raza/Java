public class lab8
{
    public static class Add{
        public void add(int ... x){
            int sum=0;
            String string="";
            for(int i : x){
                sum += i;
                string += i +"+";
            }
            string = string.substring(0,string.length() - 1) + "=";
            System.out.println(string + sum);

        }
    }

    interface OneParameterOperation{
        double execute(double x);
    }



    private static double calculate(OneParameterOperation o, double x){
        return o.execute(x);
    }

    interface TwoParameterOperation{
        double execute(double x, double y);
    }



    private static double calculate(TwoParameterOperation o, double x, double y){
        return o.execute(x, y);
    }

    //Tej metody nie wolno zmieniać!!!! (Resztę pliku wolno).
       public static void main(String[] args)
       {
           System.out.printf("2.2 + 2.2 = %f%n", calculate((double v1, double v2) -> v1 + v2, 2.2, 2.2));
           System.out.printf("44 / 2.0 = %f%n", calculate((v1, v2) -> v1 / v2, 44, 2.0));
           System.out.printf("-66 = %f%n", calculate(v -> -v, 66));
           System.out.printf("8 * 8 = %f%n", calculate((double v) -> v * v, 8));
   
           //Uwaga! Klasa Add MUSI zawierać tylko jedną funkcję!!!!
           Add oblicz=new Add();
           oblicz.add(1,2);
           oblicz.add(1,2,3);
           oblicz.add(1,2,3,4,5); 
           oblicz.add(1,2,3,4,5,6);
       }
    }
/*
Wyjście z programu wygląda tak:
2.2 + 2.2 = 4,400000
44 / 2.0 = 22,000000
-66 = -66,000000
8 * 8 = 64,000000
1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21
*/