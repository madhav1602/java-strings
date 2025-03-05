import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
      
        
        System.out.println("Longest word: " + findLongestWord(sentence));
    }

    public static String findLongestWord(String s) {
        String[] words = s.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        return longest;
    }
}
