
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


// Class to manage the grades
class GradeManager {
    private final List<Double> grades = new ArrayList<>();

    // Method to add a grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Method to get the list of grades
    public List<Double> getGrades() {
        return new ArrayList<>(grades);
    }

    // Method to calculate and return grade statistics
    public GradeStatistics calculateStatistics() {
        OptionalDouble averageOpt = grades.stream().mapToDouble(Double::doubleValue).average();
        double highest = grades.stream().mapToDouble(Double::doubleValue).max().orElse(Double.NaN);
        double lowest = grades.stream().mapToDouble(Double::doubleValue).min().orElse(Double.NaN);

        double average = averageOpt.orElse(Double.NaN);
        return new GradeStatistics(average, highest, lowest);
    }
}

