import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private String semester;
    private Map<String, Integer> courses;

    public StudentCourses(String semester, Map<String, Integer> courses) {
        this.semester = semester;
        this.courses = courses;
    }

    public void displayCourses() {
        System.out.println("Semester: " + semester);
        System.out.println("Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> coursesData = new HashMap<>();
        coursesData.put("Math", 90);
        coursesData.put("Science", 85);
        coursesData.put("History", 75);

        StudentCourses studentCourses = new StudentCourses("Spring 2024", coursesData);
        studentCourses.displayCourses();
    }
}
