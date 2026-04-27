public class UseCase16{
    public static void main(String[] args) {

        // Step 1: Create array of capacities
        int[] capacities = {50, 30, 60, 20, 40};

        System.out.println("Before Sorting:");
        printArray(capacities);

        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {


                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        printArray(capacities);
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}