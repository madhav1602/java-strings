import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Palindrome check using iterative method: " + isPalindromeIterative(input));
        System.out.println("Palindrome check using recursion: " + isPalindromeRecursive(input, 0, input.length() - 1));
        System.out.println("Palindrome check using character array: " + isPalindromeUsingArray(input));
    }

    // Method 1: Iterative palindrome check
    static boolean isPalindromeIterative(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Recursive palindrome check
    static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Method 3: Palindrome check using character array
    static boolean isPalindromeUsingArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];
        
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
}
