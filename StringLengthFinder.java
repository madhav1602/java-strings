import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.next();
        
        // Get length using built-in method
        int builtInLength = text.length();
        
        // Get length using manual method
        int manualLength = findLength(text);
        
        // Display results
        System.out.println("Built-in length: " + builtInLength);
        System.out.println("Manual length: " + manualLength);
    }

    // Method to find string length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count;
    }
}
