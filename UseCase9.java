import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    String type; 

    public Bogie(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return name + " (" + type + ")";
    }
}

public class UseCase9 {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", "AC"),
                new Bogie("B2", "Sleeper"),
                new Bogie("B3", "AC"),
                new Bogie("B4", "General"),
                new Bogie("B5", "Sleeper")
        );

        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });
    }
}