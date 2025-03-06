import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        int[] trimIndexes = findTrimIndexes(text);
        String trimmedText = customSubstring(text, trimIndexes[0], trimIndexes[1]);
        
        String builtInTrim = text.trim();
        
        System.out.println("Trimmed text (custom method): '" + trimmedText + "'");
        System.out.println("Trimmed text (built-in method): '" + builtInTrim + "'");
        System.out.println("Are both methods equal? " + compareStrings(trimmedText, builtInTrim));
    }

    // Method to find start and end indexes after trimming
    static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    // Method to extract substring using charAt
    static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings character by character
    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}
