import java.util.Scanner;
import java.lang.*;

public class StringIndexException {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        // Calling method to generate exception
        // generateException(text); 
        
        // Calling method to handle exception
        handleException(text);
        
        
    }
    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); 
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index access.");
        }
    }

}
