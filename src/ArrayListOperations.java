import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           int n = Integer.parseInt(scanner.nextLine());
        String[] items = scanner.nextLine().split(" ");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(items[i]);
        }

        // Sort list
        Collections.sort(list);

        // Search item
        String searchItem = scanner.nextLine();

        // Output
        System.out.println("Sorted Items: " + list);

        if (list.contains(searchItem)) {
            System.out.print("Found");
        } else {
            System.out.print("Not Found");
        }
    }
}
    


