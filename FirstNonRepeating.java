import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char nonRepeatingChar = findFirstNonRepeatingCharacter(input);
        
        if (nonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + nonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Method to find length of string without using length()
    static int getStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception signals end of string
        }
        return length;
    }

    // Method to find the first non-repeating character
    static char findFirstNonRepeatingCharacter(String str) {
        int length = getStringLength(str);
        int[] charCount = new int[256]; // ASCII character frequency array
        
        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < length; i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; // Return null character if no unique character found
    }
}
