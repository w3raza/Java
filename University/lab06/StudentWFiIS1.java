public class StudentWFiIS1 extends Student implements StudentUSOS {
    private String[] przedmioty = new String[3];
    private int rok;

    StudentWFiIS1(String name, String surname, int id, int rok, String przedmioty1, double grade1, String przedmioty2, double grade2, String przedmioty3, double grade3 ){
        super(name, surname, id, grade1, grade2, grade3);
        this.rok=rok;
        this.przedmioty[0] =  przedmioty1;
        this.przedmioty[1] =  przedmioty2;
        this.przedmioty[2] = przedmioty3;

    }

    public String toString(){
        return super.toString();
    }

    public double srednia(){return average();}
    
    public void listaPrzedmiotow(){
        
        String string="";

        for(int i=0; i<3;i++)
        {
            string = string +"\t"+ (i+1) +". " + przedmioty[i] + ": " + getGrade(i) +"\n" ;
        }
        System.out.println(string);
    }
    
    /* IMPLEMETACJA METOD: */

}

