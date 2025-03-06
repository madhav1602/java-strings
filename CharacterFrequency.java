import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        findCharacterFrequency(input);
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

    // Method to find character frequency using nested loops
    static void findCharacterFrequency(String str) {
        int length = getStringLength(str);
        boolean[] counted = new boolean[length]; // Track counted characters

        for (int i = 0; i < length; i++) {
            if (!counted[i]) { // Skip already counted characters
                char currentChar = str.charAt(i);
                int count = 1;
                
                for (int j = i + 1; j < length; j++) {
                    if (str.charAt(j) == currentChar) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(currentChar + ": " + count);
            }
        }
    }
}
