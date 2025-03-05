import java.util.Scanner;

public class SubstringOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the main string:");
        String str = sc.nextLine();

        System.out.println("Enter the substring to find:");
        String sub = sc.nextLine();

        sc.close();

        // Call the method to count occurrences
        System.out.println("Occurrences: " + countSubstringOccurrences(str, sub));
    }

    public static int countSubstringOccurrences(String str, String sub) {
        int count = 0;
        int index = str.indexOf(sub); // Find first occurrence

        // Keep searching until no more occurrences are found
        while (index != -1) {
            count++;
            index = str.indexOf(sub, index + 1); // Find next occurrence
        }

        return count;
    }
}
