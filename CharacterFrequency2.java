import java.util.Scanner;

public class CharacterFrequency2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);
        
        // Get frequency of unique characters
        String[][] frequencyArray = findCharacterFrequency(text, uniqueChars);
        
        // Display result
        System.out.println("Character Frequency:");
        for (String[] entry : frequencyArray) {
            System.out.println(entry[0] + " : " + entry[1]);
        }
    }

    // Method to find unique characters in the text
    static char[] findUniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(String.valueOf(ch)) == -1) {
                unique.append(ch);
            }
        }
        
        return unique.toString().toCharArray();
    }

    // Method to find frequency of unique characters in the text
    static String[][] findCharacterFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[256];
        
        // Count frequency using ASCII index
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        // Store unique characters and their frequencies in a 2D array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }
}
