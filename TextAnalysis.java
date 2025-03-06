import java.util.Scanner;

public class TextAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        String[] words = splitIntoWords(text); // Split text into words
        int[] lengths = calculateWordLengths(words); // Get word lengths
        String[][] wordData = createWordData(words, lengths); // Create word-length mapping
        int[] minMax = findMinMaxWords(wordData); // Find shortest and longest words
        
        displayResults(wordData, minMax); // Display results
    }

    // Method to split text into words without using built-in split()
    static String[] splitIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()]; // Max words cannot exceed text length
        int count = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                word.append(ch);
            } else if (word.length() > 0) {
                words[count++] = word.toString();
                word.setLength(0);
            }
        }
        if (word.length() > 0) words[count++] = word.toString(); // Add last word
        
        String[] result = new String[count];
        System.arraycopy(words, 0, result, 0, count); // Copy valid words
        return result;
    }

    // Method to calculate word lengths without using length()
    static int[] calculateWordLengths(String[] words) {
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int len = 0;
            while (len < words[i].toCharArray().length) len++; // Counting manually
            lengths[i] = len;
        }
        return lengths;
    }

    // Method to create word-length mapping
    static String[][] createWordData(String[] words, int[] lengths) {
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(lengths[i]);
        }
        return wordData;
    }

    // Method to find shortest and longest words
    static int[] findMinMaxWords(String[][] wordData) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(wordData[0][1]), maxLen = minLen;
        
        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            if (length < minLen) {
                minLen = length;
                minIndex = i;
            }
            if (length > maxLen) {
                maxLen = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    // Method to display results
    static void displayResults(String[][] wordData, int[] minMax) {
        System.out.println("\nWord Analysis:");
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] data : wordData) {
            System.out.println(data[0] + "\t" + data[1]);
        }
        System.out.println("\nShortest Word: " + wordData[minMax[0]][0]);
        System.out.println("Longest Word: " + wordData[minMax[1]][0]);
    }
}
