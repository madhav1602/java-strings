import java.util.Scanner;

public class ConvertToLowercase {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        // Convert text using built-in method
        String builtInLowercase = text.toLowerCase();
        
        // Convert text using manual method
        String manualLowercase = toLowerCaseManual(text);
        
        // Compare both results
        boolean isSame = compareStrings(builtInLowercase, manualLowercase);
        
        // Display results
        System.out.println("Built-in lowercase: " + builtInLowercase);
        System.out.println("Manual lowercase: " + manualLowercase);
        System.out.println("Are both conversions same? " + isSame);
    }

    // Method to manually convert text to lowercase
    static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

   
}
