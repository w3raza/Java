public class StudentWFiIS2 implements StudentUSOS {
    private String[] przedmioty = new String[3];
    private int rok;
    private Student stud;

    StudentWFiIS2(String name, String surname, int id, int rok, String przedmioty1, double grade1, String przedmioty2, double grade2, String przedmioty3, double grade3 ){
        stud = new Student(name, surname, id, grade1, grade2, grade3);
        this.rok=rok;
        this.przedmioty[0] =  przedmioty1;
        this.przedmioty[1] =  przedmioty2;
        this.przedmioty[2] = przedmioty3;

    }

    public String toString(){
        return stud.toString();
    }


    public double srednia(){return stud.average();}
    
    public void listaPrzedmiotow(){
        
        String string="";

        for(int i=0; i<3;i++)
        {
            string = string +"\t"+ (i+1) +". " + przedmioty[i] + ": " + stud.getGrade(i) +"\n" ;
        }
        System.out.println(string);
    }
    /* IMPLEMETACJA METOD: */

}
