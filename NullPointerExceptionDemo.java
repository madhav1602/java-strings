public class NullPointerExceptionDemo {


    public static void main(String[] args) {
      
        // Calling method to generate exception
        // generateException(); 
        
        // Calling method to handle exception
         handleException();
    }
 
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); 
        } catch (java.lang.NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to access a method on a null object.");
        }
    }
}
