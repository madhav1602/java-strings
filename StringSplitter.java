import java.util.Scanner;
import java.util.Arrays;

public class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        // Split using built-in method
        String[] builtInWords = text.split(" ");
        
        // Split using manual method
        String[] manualWords = splitText(text);
        
        // Compare the results
        boolean isSame = compareArrays(builtInWords, manualWords);
        
        // Display results
        System.out.println("Built-in split result: " + Arrays.toString(builtInWords));
        System.out.println("Manual split result: " + Arrays.toString(manualWords));
        System.out.println("Same Results: " + isSame);
    }

    // Method to split text without using split()
    static String[] splitText(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];
        
        int wordIndex = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (word.length() > 0) {
                    words[wordIndex++] = word.toString();
                    word.setLength(0);
                }
            } else {
                word.append(text.charAt(i));
            }
        }
        if (word.length() > 0) {
            words[wordIndex] = word.toString();
        }
        return words;
    }

    // Method to count words in the text
    static int countWords(String text) {
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        return count;
    }

    // Method to compare two string arrays
    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}
