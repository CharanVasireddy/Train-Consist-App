import java.util.ArrayList;
import java.util.List;


public class UseCase1TrainConsistApp {
    public static void main(String[] args) {
        List<String> trainConsist = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Passenger Bogies Management (from UseCase2)
        ArrayList<String> passengerBogies = new ArrayList<String>();

        System.out.println("==============================================");
        System.out.println("=== Train Consist Management App - UC2 =======");
        System.out.println("==============================================");

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after insertion: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removing AC Chair: " + passengerBogies);

        boolean isSleeperAvailable = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + isSleeperAvailable);

        System.out.println("Final passenger bogie list: " + passengerBogies);
        System.out.println("Program continues...");
    }
}