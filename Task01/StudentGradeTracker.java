import java.util.Scanner;

// Main class to track student grades
public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager gradeManager = new GradeManager();

        // Loop to get grades input from the user
        while (true) {
            System.out.println("Enter a grade (or type 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double grade = Double.parseDouble(input);
                // Check if the grade is positive
                if (grade < 0) {
                    System.out.println("Invalid input. Please enter a positive numeric grade.");
                } else {
                    gradeManager.addGrade(grade);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric grade.");
            }
        }

        // Calculate and display statistics if grades were entered
        if (gradeManager.getGrades().isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            GradeStatistics stats = gradeManager.calculateStatistics();
            System.out.println("Average grade: " + stats.getAverage());
            System.out.println("Highest grade: " + stats.getHighest());
            System.out.println("Lowest grade: " + stats.getLowest());
        }

        scanner.close();
    }
}

