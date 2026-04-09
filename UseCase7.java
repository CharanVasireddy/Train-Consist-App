import java.util.*;

// Bogie class (Custom Object)
class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class UseCase7 {

    public static void main(String[] args) {

        
        List<Bogie> bogieList = new ArrayList<>();

        
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));

        
        System.out.println("Bogie Details:\n");

        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}