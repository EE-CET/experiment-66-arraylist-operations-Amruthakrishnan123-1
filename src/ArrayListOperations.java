import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if there is input to avoid errors
        if (!sc.hasNext()) {
            sc.close();
            return;
        }

        String s = sc.next();
        
        // Handle empty or very short strings immediately
        if (s.length() <= 1) {
            System.out.println(s);
            sc.close();
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Iterate through the string to count consecutive characters
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1; // Reset for next char
            }
        }

        String result = compressed.toString();

        // THE FIX: Use <= to ensure equal length strings (like aabb -> a2b2) 
        // return the compressed version.
        if (result.length() <= s.length()) {
            System.out.println(result);
        } else {
            System.out.println(s);
        }

        sc.close();
    }
}
