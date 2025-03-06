import java.util.Scanner;

public class ArrayIndexException{
    
    // Method to generate ArrayIndexOutOfBoundsException
    static void generateException(String[] names, int index) {
        System.out.println(names[index]); 
    }
    
    // Method to handle ArrayIndexOutOfBoundsException
    static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        
        //  generate the exception
        // generateException(names, index);
        
        // Handling the exception properly
        handleException(names, index);
        
    }
}
