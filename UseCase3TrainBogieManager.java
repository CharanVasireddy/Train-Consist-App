import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UseCase3TrainBogieManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // HashSet to store unique bogie IDs
        Set<String> bogieSet = new HashSet<>();

        System.out.println("Enter number of bogie IDs to add:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String bogieId = scanner.nextLine();

            // Try to add bogie ID
            boolean isAdded = bogieSet.add(bogieId);

            if (isAdded) {
                System.out.println("Bogie ID added successfully.");
            } else {
                System.out.println("Duplicate Bogie ID! Ignored.");
            }
        }

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieSet) {
            System.out.println(id);
        }

        scanner.close();
    }
}