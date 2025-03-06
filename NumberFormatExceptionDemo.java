import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    static void generateException(String text) {
        int number = Integer.parseInt(text); 
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a number: ");
        String text = scanner.next(); 
        
        //  generate the exception
        // generateException(text);
        
        // Handling the exception properly
        handleException(text);
    }
}
