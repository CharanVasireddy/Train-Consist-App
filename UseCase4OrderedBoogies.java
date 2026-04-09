import java.util.LinkedList;

public class UseCase4OrderedBoogies {

    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index starts from 0)
        train.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Display final consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}