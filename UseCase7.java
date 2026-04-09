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
<<<<<<< HEAD
    public static void main(String[] args) {

        // List to store bogies
        List<Bogie> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sorting using Comparator + Lambda
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
=======

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
>>>>>>> UseCase7
    }
}