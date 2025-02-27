import java.util.ArrayList;
import java.util.List;

public class student1 {
    private String name;
    private int id;
    private List<Integer> grades;

    public student1(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public List<Integer> getGrades() { return grades; }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        int total = grades.stream().mapToInt(Integer::intValue).sum();
        return (double) total / grades.size();
    }

    public boolean isPassed() {
        return calculateAverage() >= 50.0;
    }

    @Override
    public String toString() {
        return "🎓 Student: " + name + " | ID: " + id + " | Avg: " + String.format("%.2f", calculateAverage()) + " | Status: " + (isPassed() ? "✅ Passed" : "❌ Failed");
    }
}
