import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        int[] ages = generateAges(n);
        String[][] results = checkVotingEligibility(ages);
        
        displayResults(results);
    }

    // Method to generate random 2-digit ages for students
    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 83) + 10; // Generates ages between 10 and 92
        }
        return ages;
    }

    // Method to check voting eligibility
    static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }

    // Method to display results in a tabular format
    static void displayResults(String[][] results) {
        System.out.println("\nAge\tVoting Eligibility");
        System.out.println("-----------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1]);
        }
    }
}
