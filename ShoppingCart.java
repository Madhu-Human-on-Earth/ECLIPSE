import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Prompt user to add items to the cart
        while (true) {
            System.out.print("Enter item name (or 'done' to finish): ");
            String itemName = scanner.nextLine();

            if (itemName.equals("done")) {
                break;
            }

            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            // Create Item object and add it to the cart
            Item item = new Item(itemName, itemPrice);
            cart.add(item);

            System.out.println("Item added to the cart.");
            System.out.println();
        }

        // Display items in the cart
        System.out.println("Items in the cart:");
        for (int i = 0; i < cart.size(); i++) {
            Item item = cart.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - $" + item.getPrice());
        }
        System.out.println();

        // Prompt user to remove an item from the cart
        System.out.print("Enter the index of the item to remove: ");
        int removeIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (removeIndex >= 1 && removeIndex <= cart.size()) {
            cart.remove(removeIndex - 1);
            System.out.println("Item removed from the cart.");
        } else {
            System.out.println("Invalid index. No item removed.");
        }
        System.out.println();

        // Calculate and display the total price of the items in the cart
        double totalPrice = 0;
        for (Item item : cart) {
            totalPrice += item.getPrice();
        }
        System.out.println("Total price of items in the cart: $" + totalPrice);
    }
}
