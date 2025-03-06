import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for sentence
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        // Taking user input for word to replace and new word
        System.out.println("Enter the word to replace:");
        String oldWord = sc.next();

        System.out.println("Enter the new word:");
        String newWord = sc.next();

        // Replace the word in the sentence
        String updatedSentence = sentence.replace(oldWord, newWord);
        
        // Print the result
        System.out.println("Updated sentence: " + updatedSentence);


    }
}
