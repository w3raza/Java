import java.util.ArrayList;

public class Student {
    private String imie;
    private String nazwisko;
    private Integer numerIndeksu;
    private String email = null;
    private ArrayList<Double> oceny = new ArrayList<Double>();

    Student(Integer numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getName() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addGrade(double ocena) {
        oceny.add(ocena);
    }

    public double getAverage() {
        double suma = 0.0;
        for (int i = 0; i < oceny.size(); i++)
            suma += oceny.get(i);
        double average = (suma / (oceny.size()));
        return average;
    }

    public String toString() {
        String string = imie + " " + nazwisko + " (" + numerIndeksu + ") ";
        if (!oceny.isEmpty())
            string = string + "- " + oceny;
        return string;
    }

    public boolean equals(Student obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().equals(this.getClass()))
            return false;
        Student stud = (Student) obj;
        if (obj.imie.equals(stud.imie) && obj.nazwisko.equals(stud.nazwisko)
                && obj.numerIndeksu.equals(stud.numerIndeksu) && obj.email != null && obj.oceny != null)
            return true;
        else
            return false;
    }
}