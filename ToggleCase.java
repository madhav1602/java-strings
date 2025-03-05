import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        sc.close();

        // Call method to toggle case
        System.out.println("Toggled String: " + toggleCase(str));
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is uppercase, then convert to lowercase and vice versa
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }

        return result.toString();
    }
}
