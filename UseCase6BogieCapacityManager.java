import java.util.HashMap;
import java.util.Map;

public class UseCase6BogieCapacityManager {

    public static void main(String[] args) {

        
        HashMap<String, Integer> bogieMap = new HashMap<>();

      
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 60);
        bogieMap.put("First Class", 40);

        
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        System.out.println("\nProgram continues...");
    }
}