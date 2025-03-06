import java.lang.*;
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {
        System.out.println(text.substring(start, end)); 
    }

    // Method to handle IllegalArgumentException
     static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index (should be less than start): ");
        int end = scanner.nextInt();
        
        // Calling method to generate exception
        // generateException(text, start, end); 
        
        // Calling method to handle exception
        handleException(text, start, end);
        
    }
}
