import java.util.Arrays;

public final class Student {

    private final String imie;
    private final String nazwisko;
    private final int numerIndeksu;
    private final double[] oceny;

    public static class Builder {

        private String imie;
        private String nazwisko;
        private int numerIndeksu = 0;
        private double[] oceny = new double[0];

        public Builder firstName(String imie) {
            this.imie = imie;

            return this;
        }

        public Builder lastName(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder indexNumber(int numerIndeksu) {
            this.numerIndeksu = numerIndeksu;
            return this;
        }

        public Builder grade(double ocena) {
            double[] temp = oceny;
            oceny = new double[temp.length + 1];
            for (int i = 0; i < temp.length; i++) {
                oceny[i] = temp[i];
            }
            oceny[temp.length] = ocena;

            return this;
        }

        public Student build() {
            if (nazwisko == null) {
                System.out.println("Last name is required!");
                return null;
            }
            if (imie == null) {
                System.out.println("Name is required!");
                return null;
            }
            if (numerIndeksu == 0) {
                System.out.println("Number of index is required!");
                return null;
            }
            return new Student(this.imie, this.nazwisko, this.numerIndeksu, this.oceny);
        }
    }

    private Student(String imie, String nazwisko, Integer numerIndeksu, double[] oceny) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public final double[] getGrades() {
        return Arrays.copyOf(oceny, oceny.length);
    }

    public final String toString() {
        String string = imie + " " + nazwisko + " (" + numerIndeksu + ")";
        if (oceny.length != 0)
            string = string + " - " + oceny[0] + " " + oceny[1];

        return string;
    }

    public final boolean equals(Student obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().equals(this.getClass()))
            return false;

        Student stud = (Student) obj;
        if (obj.imie.equals(stud.imie) && obj.nazwisko.equals(stud.nazwisko) && obj.numerIndeksu == (stud.numerIndeksu)
                && Arrays.equals(obj.oceny, stud.oceny))
            return true;
        else
            return false;
    }
}