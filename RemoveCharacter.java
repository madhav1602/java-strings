import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for word and character to remove
        System.out.println("Enter the word:");
        String word = sc.nextLine();

        System.out.println("Enter the character to remove:");
        String ch = sc.next();  

        // Ensure only one character is removed
        if (ch.length() != 1) {
            System.out.println("Please enter a single character.");
        } else {
            // Removing the specified character 
            String result = word.replaceAll(ch, "");
            System.out.println("Modified word: " + result);
        }
    }
}
