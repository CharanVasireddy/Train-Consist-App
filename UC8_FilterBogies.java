import java.util.*;
import java.util.stream.*;

class Bogie {
    int id;
    int capacity;
    String type;

    // Constructor
    Bogie(int id, int capacity, String type) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
    }

    // Display method
    void display() {
        System.out.println("Bogie ID: " + id + ", Capacity: " + capacity + ", Type: " + type);
    }
}

public class UC8_FilterBogies {
    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, 50, "Sleeper"));
        bogies.add(new Bogie(2, 72, "AC"));
        bogies.add(new Bogie(3, 65, "General"));
        bogies.add(new Bogie(4, 55, "Chair Car"));
        bogies.add(new Bogie(5, 80, "AC First Class"));

        // Step 2: Convert list into stream and apply filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // Condition
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Program continues...
    }
}