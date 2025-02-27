import java.util.*;

public class GradeManager {
    private List<Student> students;
    private Scanner sc;

    public GradeManager() {
        this.students = FileHandler3.loadStudents();
        this.sc = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        students.add(new Student(name, id));
        FileHandler3.saveStudents(students);
        System.out.println("✅ Student Added Successfully!");
    }

    public void enterGrades() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student student = findStudentById(id);
        if (student != null) {
            System.out.print("Enter grade (0-100): ");
            int grade = sc.nextInt();
            sc.nextLine(); // Consume newline

            student1.addGrade(grade);
            FileHandler3.saveStudents(students);
            System.out.println("✅ Grade Added Successfully!");
        } else {
            System.out.println("❌ Student Not Found!");
        }
    }

    public void viewStudentReport() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student student = findStudentById(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("❌ Student Not Found!");
        }
    }

    public void viewAllStudents() {
        System.out.println("\n📌 Student Records:");
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private Student findStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
