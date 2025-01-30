import java.util.Scanner; // Importing Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read user input

        // Display menu options to the user
        System.out.println("1. Get Discount");
        System.out.println("2. Get Interest");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read user choice (1 for discount, 2 for interest)

        // Process the choice
        if (choice == 1) {
            // If user chooses discount calculation
            System.out.print("Enter amount: ");
            double amount = input.nextDouble(); // Read the amount
            double discount = getDiscount(amount); // Call method to calculate discount
            System.out.println("Discount: " + discount); // Display the discount amount
        } else if (choice == 2) {
            // If user chooses simple interest calculation
            System.out.print("Enter Principal: ");
            double principal = input.nextDouble(); // Read principal amount
            System.out.print("Enter Rate (as a decimal, e.g., 0.05 for 5%): ");
            double rate = input.nextDouble(); // Read interest rate
            System.out.print("Enter Time (in years): ");
            double time = input.nextDouble(); // Read time in years

            double interest = simpleInterest(principal, rate, time); // Call method to calculate interest
            System.out.println("Simple Interest: " + interest); // Display the interest amount
        } else {
            System.out.println("Invalid choice."); // Handle invalid input
        }

        input.close(); // Close Scanner to prevent memory leaks
    }

    // Method to calculate discount based on price
    public static double getDiscount(double price) {
        double discount;
        if (price > 5000) {
            discount = 0.10 * price; // 10% discount for price above 5000
        } else if (price > 1000) {
            discount = 0.05 * price; // 5% discount for price between 1001 and 5000
        } else {
            discount = 0; // No discount for price 1000 or below
        }
        return discount;
    }

    // Method to calculate simple interest
    public static double simpleInterest(double principal, double rate, double time) {
        return principal * rate * time; // Formula: SI = P * R * T
    }
}
