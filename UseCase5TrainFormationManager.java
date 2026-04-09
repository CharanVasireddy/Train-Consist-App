import java.util.LinkedHashSet;

public class UseCase5TrainFormationManager {

    public static void main(String[] args) {

        
        LinkedHashSet<String> train = new LinkedHashSet<>();

        
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

       
        boolean isAdded = train.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate bogie 'Sleeper' ignored!");
        }

        
        System.out.println("\nFinal Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}