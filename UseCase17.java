import java.util.*;

public class UseCase17{
    public static void main(String[] args) {

        // Step 1: Create array of bogie types
        String[] bogieTypes = {"Sleeper", "AC", "General", "Cylindrical"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // Step 2: Sort using Arrays.sort()
        Arrays.sort(bogieTypes);

        // Step 3: Display sorted result
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}