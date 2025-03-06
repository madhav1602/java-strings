import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        
        // Comparing strings using both methods
        boolean charAtComparison = compareStrings(str1, str2);
        boolean equalsMethodComparison = str1.equals(str2);
        
        // Printing results
        System.out.println("Comparison using charAt() method: " + charAtComparison);
        System.out.println("Comparison using equals() method: " + equalsMethodComparison);
        
        // Checking if both methods give the same result
        if (charAtComparison == equalsMethodComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
        
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; 
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }
}
