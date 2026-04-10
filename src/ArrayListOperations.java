import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of items
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        // Read items
        String[] inputItems = sc.nextLine().split(" ");

        ArrayList<String> items = new ArrayList<>();

        // Add items to list
        for (int i = 0; i < N; i++) {
            items.add(inputItems[i]);
        }

        // Sort alphabetically
        Collections.sort(items);

        // Read search item
        String searchItem = sc.nextLine();

        // Check if item exists
        boolean found = items.contains(searchItem);

        // Print sorted list
        System.out.print("Sorted Items: [");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i));
            if (i != items.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Print result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
