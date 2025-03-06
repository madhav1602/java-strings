import java.util.Scanner;

public class UniqueCharactersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(input);
        
        System.out.println("Unique characters in the string:");
        for (int i = 0; i < uniqueChars.length; i++) {
            if (uniqueChars[i] != '\0') { // Ignore empty values
                System.out.print(uniqueChars[i] + " ");
            }
        }
    }

    // Method to find length of string without using length()
    static int getStringLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception signals end of string
        }
        return length;
    }

    // Method to find unique characters using charAt()
    static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            
            // Check if character already exists in uniqueChars array
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }
        return uniqueChars;
    }
}
