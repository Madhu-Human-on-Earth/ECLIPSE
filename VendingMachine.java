import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // Product prices
        double cokePrice = 1.50;
        double spritePrice = 1.25;
        double waterPrice = 1.00;

        // Product names
        String coke = "Coke";
        String sprite = "Sprite";
        String water = "Water";

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Available Products:");
        System.out.println("1. " + coke + " - $" + cokePrice);
        System.out.println("2. " + sprite + " - $" + spritePrice);
        System.out.println("3. " + water + " - $" + waterPrice);
        System.out.print("Enter the product number: ");
        int productNumber = scanner.nextInt();

        // Validate product number
        if (productNumber < 1 || productNumber > 3) {
            System.out.println("Invalid product number.");
            return;
        }

        // Calculate product price
        double productPrice;
        String productName;
        switch (productNumber) {
            case 1:
                productPrice = cokePrice;
                productName = coke;
                break;
            case 2:
                productPrice = spritePrice;
                productName = sprite;
                break;
            case 3:
                productPrice = waterPrice;
                productName = water;
                break;
            default:
                System.out.println("Invalid product number.");
                return;
        }

        System.out.print("Enter the amount of money you are inserting: $");
        double amountInserted = scanner.nextDouble();

        // Calculate change and provide appropriate messages
        if (amountInserted >= productPrice) {
            double change = amountInserted - productPrice;
            System.out.println("You have purchased " + productName);
            System.out.println("Your change: $" + change);
        } else {
            System.out.println("Insufficient amount. Please insert more money.");
        }
    }
}
