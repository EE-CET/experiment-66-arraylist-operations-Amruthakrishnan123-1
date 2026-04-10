import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Change 'ArrayListOperations' to 'Main' if the autograder requires src/Main.java
public class ArrayListOperations { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        ArrayList<String> cart = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cart.add(sc.next());
        }

        String searchItem = sc.next();
        Collections.sort(cart);

        System.out.println("Sorted Items: " + cart);

        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    } // This closes the main method
} // This closes the class
