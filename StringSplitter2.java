import java.util.Scanner;
import java.util.Arrays;

public class StringSplitter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        // Split using manual method
        String[][] wordsWithLength = splitTextWithLength(text);
        
        // Display results in tabular format
        System.out.println("Word\tLength");
        for (String[] entry : wordsWithLength) {
            System.out.println(entry[0] + "\t" + Integer.parseInt(entry[1]));
        }
    }

    // Method to split text without using split() and return words with lengths
    static String[][] splitTextWithLength(String text) {
        int wordCount = countWords(text);
        String[][] wordsWithLength = new String[wordCount][2];
        
        int wordIndex = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (word.length() > 0) {
                    wordsWithLength[wordIndex][0] = word.toString();
                    wordsWithLength[wordIndex][1] = String.valueOf(getStringLength(word.toString()));
                    wordIndex++;
                    word.setLength(0);
                }
            } else {
                word.append(text.charAt(i));
            }
        }
        if (word.length() > 0) {
            wordsWithLength[wordIndex][0] = word.toString();
            wordsWithLength[wordIndex][1] = String.valueOf(getStringLength(word.toString()));
        }
        return wordsWithLength;
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

    // Method to find string length without using length()
    static int getStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }
}
