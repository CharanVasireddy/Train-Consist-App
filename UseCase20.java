import java.util.*;

public class UseCase20{

    public static void searchBogie(List<String> bogies, String key) {

        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot search: No bogies available in the train");
        }

        boolean found = false;

        for (String b : bogies) {
            if (b.equals(key)) {
                System.out.println("Bogie found: " + key);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie not found: " + key);
        }
    }

    public static void main(String[] args) {

        List<String> bogies = new ArrayList<>(); // Empty list

        try {
            searchBogie(bogies, "B1");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}