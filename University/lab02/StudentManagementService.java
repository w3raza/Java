import java.util.ArrayList;

public class StudentManagementService {
    private ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        if (!students.contains(student))
            students.add(student);
    }

    public void printAllStudents() {
        System.out.println("*** Students ***");
        for (Student i : students)
            System.out.println(i);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student findStudentWithTheHighestAverage() {
        Student theBestOne;
        double max_avrage = students.get(0).getAverage();
        theBestOne = students.get(0);
        for (Student i : students)
            if (max_avrage < i.getAverage()) {
                max_avrage = i.getAverage();
                theBestOne = i;
            }

        return theBestOne;
    }
}