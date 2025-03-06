import java.util.Scanner;

public class CharArrayComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        // Making character arrays using both methods
        char[] customChars = getCharacters(text);
        char[] builtInChars = text.toCharArray();
        
        // Comparing both character arrays
        boolean areEqual = compareCharArrays(customChars, builtInChars);
        
        // Displaying results
        System.out.println("Characters using custom method: " + new String(customChars));
        System.out.println("Characters using toCharArray(): " + new String(builtInChars));
        System.out.println("both methods produce the same result? " + areEqual);
        
    }
  // Method to return all characters of a string as a character array
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
      }
}
