import java.util.Scanner;

public class VowelConsonantClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String[][] result = classifyCharacters(text);
        
        displayResult(result);
    }

    // Method to check if a character is a vowel or consonant
    static String getCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    // Method to classify each character in the string
    static String[][] classifyCharacters(String text) {
        String[][] classification = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            classification[i][0] = String.valueOf(ch);
            classification[i][1] = getCharacterType(ch);
        }
        
        return classification;
    }

    // Method to display the results in a tabular format
    static void displayResult(String[][] result) {
        System.out.println("Character\tType");
        System.out.println("----------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}
