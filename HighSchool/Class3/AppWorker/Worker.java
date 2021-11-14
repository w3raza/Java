// Napisz aplikację pozwalającą przechowywać informacje o pracownikach (imię, nazwisko, wiek, wzrost, płeć, data zatrudnienia).
// Aplikacja powinna ponadto umożliwiać:
// a)Dodawanie nowych pracowników
// b)wyszukiwanie pracowników według różnych kryteriów
// c)wyszukiwanie pracownika najstarszego, najmłodszego itp.
// d)wyszukiwanie pracowników o najwyższym stażu w firmie w odniesieniu do bieżącej daty
// e)sortowanie pracowników według różnych kryteriów: nazwiska, wieku, wagi

public class Worker implements Comparable<Worker> {
    private String name;
    private String surname;
    private Integer age;
    private Integer height;
    private String gender;
    private Integer year;
    private Integer month;
    private Integer date;

    Worker(String name, String surname, Integer age, Integer height, String gender, Integer date, Integer month,
            Integer year) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getDate() {
        return date;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return "Name: " + name + " |Surname: " + surname + " |Age:" + age + "|Height: " + height
                + " |Date of employment: " + date + "." + month + "." + year + "\n";
    }

    public String isGender() {
        if (gender.equals("m"))
            return "He";
        else
            return "She";
    }

    @Override
    public int compareTo(Worker o) {
        return 0;
    }
}