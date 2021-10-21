public class EmailService {
    public void generateEmailForStudent(Student student,String wydzial){
        student.setEmail(student.getName() + "." + student.getNazwisko() + "@" + wydzial +".pl");
    }

}