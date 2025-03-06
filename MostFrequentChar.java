import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        

        // Calling method and print the most frequent character
        char result = getMostFrequentChar(str);
        System.out.println("Most frequent character: " + result);
    }

    public static char getMostFrequentChar(String str) {
        int[] freq = new int[256]; 
        int maxFreq = 0;
        char mostFrequentChar = ' ';

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++; 
            
            // Update most frequent character
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}
