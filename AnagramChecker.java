import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.println("Are the two strings anagrams? " + areAnagrams(str1, str2));
    }

    // Method to check if two strings are anagrams
    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] freq = new int[256]; // ASCII character frequency array
        
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
