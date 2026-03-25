Detailed Explanation by xen0byt3

	Important Notes:
		*Encapsulation = hide data using private
		*Getter = get value safely
		*Setter = change value with rules
		*Method = adds behavior (like computing total value)


1. Import Scanner
	import java.util.Scanner;
This allows the program to accept user input (like numbers and choices).

2. Create Class (PCPart)
	class PCPart {
This is a blueprint for a PC part (example: RAM, SSD, GPU).
Each object created from this class represents one PC part.

3. Private Variables (Encapsulation)
	private String partName;
	private int quantity;
	private double price;
These are data fields of the PC part.
private means:
They cannot be accessed directly outside the class.
This is called encapsulation (data hiding).

4. Constructor
	public PCPart(String partName, int quantity, double price) {
  	  this.partName = partName;
  	  this.quantity = quantity;
   	 this.price = price;
	}
	A constructor is used to initialize values when an object is created.
		this.partName //refers to the class variable.

Example:

	PCPart part = new PCPart("RAM 8GB", 10, 1500);

5. Getter Methods
	public String getPartName() {
    return partName;
	}

	public int getQuantity() {
 	   return quantity;
	}

	public double getPrice() {
	    return price;
	}
These methods are used to retrieve (get) values.
Since variables are private, we use getters to access them safely.

6. Setter Method
	public void setQuantity(int quantity) {
 	   this.quantity = quantity;
	}
This method is used to update/change the value.
Only quantity has a setter here.

7. Method: Display Part
	public void displayPart() {
 	   System.out.println("Part Name: " + partName);
 	   System.out.println("Quantity : " + quantity);
 	   System.out.println("Price    : ₱" + price);
	}
This method prints the details of the PC part.

8. Method: Add Stock
	public void addStock(int amount) {
	    quantity += amount;
	    System.out.println("Stock added successfully!");
	}
Adds stock to the current quantity.
Example: 10 + 5 = 15

9. Method: Remove Stock
	public void removeStock(int amount) {
 	   if (amount <= quantity) {
 	       quantity -= amount;
 	       System.out.println("Stock removed successfully!");
 	   } else {
    	    System.out.println("Not enough stock!");
  	  }
	}
Removes stock only if there is enough quantity.
Prevents negative values.

10. Main Class
	public class Main {
This is where the program starts running.

11. Main Method
	public static void main(String[] args) {
The entry point of the program.

12. Scanner Object
	Scanner input = new Scanner(System.in);
Used to read user input from the keyboard.

13. Create Object
	PCPart part = new PCPart("RAM 8GB", 10, 1500.00);
	Creates a PC part with:
	Name: RAM 8GB
	Quantity: 10
	Price: ₱1500

14. Menu Variable
	int choice;
Stores the user’s menu choice.

15. Loop (Menu System)
	do {
Repeats the menu until the user chooses Exit.

16. Menu Display
	System.out.println("\n=== PC PARTS INVENTORY SYSTEM ===");
	System.out.println("1. View Part");
	System.out.println("2. Add Stock");
	System.out.println("3. Remove Stock");
	System.out.println("4. Exit");
Shows options to the user.

17. User Input
	choice = input.nextInt();
Reads the user’s choice.

18. Switch Statement
	switch (choice) {
Controls what happens based on user input.

Case 1: View Part
	case 1:
 	   part.displayPart();
 	   break;
	Calls the method to show part details.

Case 2: Add Stock
	case 2:
	    System.out.print("Enter quantity to add: ");
	    int add = input.nextInt();
 	   part.addStock(add);
 	   break;
	Gets input and calls addStock().

Case 3: Remove Stock
	case 3:
  	  System.out.print("Enter quantity to remove: ");
  	  int remove = input.nextInt();
  	  part.removeStock(remove);
  	  break;
	Gets input and calls removeStock().

Case 4: Exit
	case 4:
 	   System.out.println("Exiting program...");
 	   break;
	Ends the program.

Default
	default:
	    System.out.println("Invalid choice!");
	Handles wrong input.


19. Loop Condition
	} while (choice != 4);
	Keeps running until user selects Exit.

20. Close Scanner
	input.close();
	Closes input to avoid memory issues.