import java.util.Scanner;

public class LexicographicComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for two strings
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();
        
        

        // Compare strings and print result
        int result = compareStrings(str1, str2);
        if (result < 0) {
            System.out.println("First string is smaller.");
        } else if (result > 0) {
            System.out.println("First string is greater.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        int minLen = Math.min(len1, len2);

        // Compare characters one by one
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i); 
            }
        }

        // If all characters match, compare length
        return len1 - len2;
    }
}
