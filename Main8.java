import java.util.Scanner;

public class Main8 {
    private static GradeManager gradeManager = new GradeManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("📊 Welcome to Student Grade Management System 📊");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Enter Grades");
            System.out.println("3. View Student Report");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    gradeManager.addStudent();
                    break;
                case 2:
                    gradeManager.enterGrades();
                    break;
                case 3:
                    gradeManager.viewStudentReport();
                    break;
                case 4:
                    gradeManager.viewAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye! 🎓");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
