import java.util.*;

public class UseCase12 {

    private static class Bogie {
        String type;
        String cargo;

        public Bogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Box", "Coal"),
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Flat", "Steel")
        );

        // Step 2 + 3 + 4: Stream + allMatch + condition
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical → only Petroleum
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true; // other types are allowed
                });

        // Step 5: Display result
        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}