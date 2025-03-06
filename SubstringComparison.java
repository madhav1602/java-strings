import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        //  substrings using both methods
        String customSub = customSubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        
        // Comparing both substrings
        boolean areEqual = compareStrings(customSub, builtInSub);
        
        // Printing results
        System.out.println("Substring using charAt(): " + customSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("both methods give same result? " + areEqual);
        
        
    }

  // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
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
