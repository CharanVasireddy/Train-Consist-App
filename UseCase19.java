import java.util.*;

public class UseCase19{
    public static void main(String[] args) {
 
        String[] bogieIds = {"B1", "B2", "B3", "B4", "B5"};


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;


        while (low <= high) {

            int mid = (low + high) / 2;


            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            } 
            else if (result > 0) {
                low = mid + 1; 
            } 
            else {
                high = mid - 1; 
            }
        }

        if (!found) {
            System.out.println("Bogie not found");
        }

        sc.close();
    }
}