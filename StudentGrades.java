import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        
        int[][] scores = generateScores(students); // Generate random scores for students
        double[][] stats = calculateStats(scores); // Compute total, average, and percentage
        String[] grades = assignGrades(stats); // Determine grades based on percentage
        
        displayResults(scores, stats, grades); // Display the final scorecard
    }

    // Method to generate random scores between 50 and 100 for each subject
    static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 50) + 50; // Physics score
            scores[i][1] = (int)(Math.random() * 50) + 50; // Chemistry score
            scores[i][2] = (int)(Math.random() * 50) + 50; // Math score
        }
        return scores;
    }

    // Method to calculate total marks, average, and percentage for each student
    static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Sum of scores
            double average = total / 3.0; // Compute average
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0; // Compute percentage rounded to 2 decimal places
            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }

    // Method to assign grades based on percentage obtained
    static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2]; // Retrieve percentage
            if (percentage >= 90) grades[i] = "A+";
            else if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else grades[i] = "F"; 
        }
        return grades;
    }

    // Method to display student results in a formatted table
    static void displayResults(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f%%\t%s\n",
                scores[i][0], scores[i][1], scores[i][2], (int)stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
}
