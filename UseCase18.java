import java.util.*;

public class UseCase18{
    public static void main(String[] args) {

        
        String[] bogieIds = {"B1", "B3", "B5", "B2", "B4"};

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(key)) {
                System.out.println("Bogie found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie not found");
        }

        sc.close();
    }
}