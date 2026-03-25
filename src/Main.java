import java.util.Scanner;

// Class with encapsulation
class PCPart {

    // Private variables (encapsulation)
    private String partName;
    private int quantity;
    private double price;

    // Constructor
    public PCPart(String partName, int quantity, double price) {
        this.partName = partName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter methods
    public String getPartName() {
        return partName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Setter method (to update quantity)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to display part details
    public void displayPart() {
        System.out.println("Part Name: " + partName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price    : ₱" + price);
    }

    // Method to add stock
    public void addStock(int amount) {
        quantity += amount;
        System.out.println("Stock added successfully!");
    }

    // Method to reduce stock
    public void removeStock(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Stock removed successfully!");
        } else {
            System.out.println("Not enough stock!");
        }
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create object
        PCPart part = new PCPart("RAM 8GB", 10, 1500.00);

        int choice;

        do {
            System.out.println("\n=== PC PARTS INVENTORY SYSTEM ===");
            System.out.println("1. View Part");
            System.out.println("2. Add Stock");
            System.out.println("3. Remove Stock");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    part.displayPart();
                    break;

                case 2:
                    System.out.print("Enter quantity to add: ");
                    int add = input.nextInt();
                    part.addStock(add);
                    break;

                case 3:
                    System.out.print("Enter quantity to remove: ");
                    int remove = input.nextInt();
                    part.removeStock(remove);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}