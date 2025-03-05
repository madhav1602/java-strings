import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Add all characters to Hash set
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        // take out characters from hash set
        String result = "";
        for (char c : set) {
            result = result + c;  // String concatenation
        }

        return result;
    }
}
