import java.util.Scanner;

public class CharacterFrequency1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Find character frequencies
        int[][] frequencyArray = findCharacterFrequency(text);
        
        // Display character frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i][1] > 0) {
                System.out.println((char) frequencyArray[i][0] + ": " + frequencyArray[i][1]);
            }
        }
    }
    
    // Method to find character frequency
    static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII range)
        
        // Count occurrences of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        // Store characters and their frequencies in a 2D array
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }
        
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i; // Character ASCII value
                result[index][1] = frequency[i]; // Frequency
                index++;
            }
        }
        
        return result;
    }
}
