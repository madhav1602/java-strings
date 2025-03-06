import java.util.Scanner;

public class ConvertToUppercase {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Convert using user-defined method
        String upperText1 = convertToUpper(text);
        
        // Convert using built-in method
        String upperText2 = text.toUpperCase();
        
        // Compare results
        boolean isSame = compareStrings(upperText1, upperText2);
        
        System.out.println("Converted String (User-defined method): " + upperText1);
        System.out.println("Converted String (Built-in method): " + upperText2);
        System.out.println("Are both results the same? " + isSame);
    }

    // Method to convert without using toUpperCase()
    static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); 
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

}
