package javaapplication18;

import java.util.Scanner;

class ShoppingCart {

    String cartOwnerName;

    class Item {

        String itemName;
        double price;
        int quantity;
        double[] priceHistory;

        void addItem(Scanner sc) {

            System.out.print("Enter Cart Owner Name: ");
            cartOwnerName = sc.nextLine();

            System.out.print("Enter Item Name: ");
            itemName = sc.nextLine();

            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();

            System.out.print("Enter Number of Price Updates: ");
            int n = sc.nextInt();

            priceHistory = new double[n];
        }

        void updatePriceHistory(Scanner sc) {

            System.out.println("Enter Prices:");

            for (int i = 0; i < priceHistory.length; i++) {
                priceHistory[i] = sc.nextDouble();
            }

            price = priceHistory[priceHistory.length - 1];
        }

        double calculateTotalBill() {

            return price * quantity;
        }

        void display() {

            System.out.println("\nCart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);

            System.out.print("Price History: ");

            for (int i = 0; i < priceHistory.length; i++) {
                System.out.print(priceHistory[i] + " ");
            }

            System.out.println("\nLatest Price: " + price);
            System.out.println("Total Bill: " + calculateTotalBill());
        }
    }
}

public class JavaApplication18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();
        ShoppingCart.Item item = cart.new Item();

        int choice;

        do {

            System.out.println("\n1. Add Item");
            System.out.println("2. Update Price History");
            System.out.println("3. Calculate Total Bill");
            System.out.println("4. Display Cart Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    item.addItem(sc);
                    break;

                case 2:
                    item.updatePriceHistory(sc);
                    break;

                case 3:
                    System.out.println("Total Bill: "
                            + item.calculateTotalBill());
                    break;

                case 4:
                    item.display();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}