
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            // 🔥 Safety Rule
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Cannot assign Petroleum to Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }
}

public class UseCase15{
    public static void main(String[] args) {

        // Valid case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // Invalid case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        // Another valid case
        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}