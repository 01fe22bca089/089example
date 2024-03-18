import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private String dob;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        DateTimeFormatter formatter = dob.contains("-") ? DateTimeFormatter.ofPattern("yyyy-MM-dd") :
                                                    DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthDate.getYear() - (currentDate.getMonthValue() < birthDate.getMonthValue() ? 1 :
                                                                 (currentDate.getMonthValue() == birthDate.getMonthValue() &&
                                                                  currentDate.getDayOfMonth() < birthDate.getDayOfMonth() ? 1 : 0));
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "2000-05-15");
        student1.displayName();
        student1.displayAge();
    }
}
