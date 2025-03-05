import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        

        char[] reversed = new char[str.length()];

        // Reverse using 
        for (int i = 0; i < str.length(); i++) {
            reversed[i] = str.charAt(str.length() - 1 - i);
        }

        // Print reversed string 
        System.out.print("Reversed String: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }
    }
}
