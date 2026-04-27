import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase10 {
    public static void main(String[] args) {

        
        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", 50),
                new Bogie("B2", 60),
                new Bogie("B3", 55),
                new Bogie("B4", 70)
        );

        
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
        
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}