import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Napisz aplikację pozwalającą przechowywać informacje o pracownikach (imię,
// nazwisko, wiek, wzrost, płeć, data zatrudnienia).
// Aplikacja powinna ponadto umożliwiać:
// a)Dodawanie nowych pracowników
// b)wyszukiwanie pracowników według różnych kryteriów
// c)wyszukiwanie pracownika najstarszego, najmłodszego itp.
// d)wyszukiwanie pracowników o najwyższym stażu w firmie w odniesieniu do
// bieżącej daty
// e)sortowanie pracowników według różnych kryteriów: nazwiska, wieku, wagi

public class TestWorker {
    private static Scanner scanner = new Scanner(System.in);

    static public void addWorker(List<Worker> list) {
        String name;
        String surname;
        Integer age;
        Integer height;
        String gender;
        Integer year;
        Integer month;
        Integer date;

        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter surname:");
        surname = scanner.nextLine();
        System.out.println("Enter age:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter height:");
        height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter gender: (w/m)");
        gender = scanner.nextLine();
        System.out.println("Enter date Of employment: (day)");
        date = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter month Of employment: (month)");
        month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter year Of employment: (year)");
        year = scanner.nextInt();
        scanner.nextLine();

        Worker worker = new Worker(name, surname, age, height, gender, date, month, year);
        list.add(worker);
    }

    static public void searchByAge(List<Worker> list) {
        sortByAge(list);
        System.out.println("Enter age:");
        Integer age = scanner.nextInt();
        int result = Collections.binarySearch(list, new Worker(null, null, age, null, null, null, null, null),
                new CompAge());
        if (result > 0)
            System.out.println((list.get(result)));
        else
            System.out.println("Nobody have this age");
    }

    static public void searchByTheLongestExperience(List<Worker> list) {
        Collections.sort(list, new CompExperience());
        System.out.println((list.get(list.size() - 1)));
        howLongWork(list.get(list.size() - 1));
    }

    static public void howLongWork(Worker o1) {
        Calendar calendar = Calendar.getInstance();

        int date = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        int days = (date - o1.getDate()), months = (month - o1.getMonth()), years = (year - o1.getYear());
        if (days < 0) {
            months--;
            days = Math.abs(days);
        }
        if (months < 0) {
            years--;
            months = Math.abs(months);
        }

        System.out
                .println(o1.isGender() + " have worked: " + years + "years, " + months + " months, " + days + " days");
    }

    static public void sortBySurname(List<Worker> list) {
        Collections.sort(list, new CompSurname());
        for (Worker el : list) {
            System.out.println(el);
        }
    }

    static public void sortByAge(List<Worker> list) {
        Collections.sort(list, new CompAge());
    }

    static public void sortByHeight(List<Worker> list) {
        Collections.sort(list, new CompHeight());
        for (Worker el : list) {
            System.out.println(el);
        }
    }

    static public boolean TestAnswer(int answer) {
        return (answer > 0 && answer < 9);
    }

    static public void display() {
        System.out.println("\n" + "Options: ");
        System.out.println("1) Add new worker");
        System.out.println("2) Search by age");
        System.out.println("3) Search by the longest experience");
        System.out.println("4) Sort by surname");
        System.out.println("5) Sort by age");
        System.out.println("6) Sort by height");
        System.out.println("7) Display everyone");
        System.out.println("8) End");
    }

    static public void choose(List<Worker> list) {
        boolean shouldContinue = true;
        System.out.println("Choose one option: (enter the appropriate number)");

        while (shouldContinue) {
            display();
            int answer = scanner.nextInt();
            scanner.nextLine();
            if (TestAnswer(answer)) {
                switch (answer) {
                case 1:
                    addWorker(list);
                    break;
                case 2:
                    searchByAge(list);
                    break;
                case 3:
                    searchByTheLongestExperience(list);
                    break;
                case 4:
                    sortBySurname(list);
                    break;
                case 5:
                    sortByAge(list);
                    for (Worker el : list) {
                        System.out.println(el);
                    }
                    break;
                case 6:
                    sortByHeight(list);
                    break;
                case 7:
                    System.out.println(list);
                    break;
                case 8:
                    shouldContinue = false;
                    break;
                }
            } else
                System.out.println("Wrong number. Try again");
        }
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("John", "Wilson", 27, 175, "m", 23, 07, 2017);
        Worker worker2 = new Worker("Ray", "Wilson", 34, 181, "m", 12, 03, 2005);
        Worker worker3 = new Worker("Brian", "Dre", 52, 169, "m", 15, 11, 2004);
        Worker worker4 = new Worker("Jennifer", "Smith", 23, 159, "w", 05, 07, 2021);
        Worker worker5 = new Worker("Patrick", "Clonney", 61, 176, "m", 30, 01, 1992);
        Worker worker6 = new Worker("Katy", "Badgley", 31, 168, "w", 01, 10, 2017);

        List<Worker> list = new ArrayList<>();
        list.addAll(Arrays.asList(worker1, worker2, worker3, worker4, worker5, worker6));

        choose(list);
    }
}