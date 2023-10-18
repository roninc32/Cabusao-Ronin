import java.util.Scanner;
import java.text.DecimalFormat;

public class ProductQuantity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menuItems = {"c1", "c2", "c3"};
        int[] menuPrices = {100, 150, 200};

        String[] addOns = {"r1", "r2"};
        int[] addOnPrices = {35, 50};

        int totalPrice = 0;
        int totalQuantity = 0;

        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i] + " = Php " + menuPrices[i]);
        }

        System.out.println("Add ons:");
        for (int i = 0; i < addOns.length; i++) {
            System.out.println(addOns[i] + " = Php " + addOnPrices[i]);
        }

        while (true) {
            System.out.print("Enter item code (e.g., c1 or r1) or 'done' to finish: ");
            String input = scanner.nextLine().toLowerCase(); 

            if (input.equals("done")) {
                break;
            }

            int itemPrice = 0;

            for (int i = 0; i < menuItems.length; i++) {
                if (input.equals(menuItems[i])) {
                    itemPrice = menuPrices[i];
                    break;
                }
            }

            for (int i = 0; i < addOns.length; i++) {
                if (input.equals(addOns[i])) {
                    itemPrice = addOnPrices[i];
                    break;
                }
            }

            if (itemPrice == 0) {
                System.out.println("Invalid item code. Please try again.");
            } else {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                totalPrice += itemPrice * quantity;
                totalQuantity += quantity;
                scanner.nextLine();
            }
        }

        System.out.println("Total Price: Php " + totalPrice);
        System.out.println("Total Quantity: " + totalQuantity);

        double dollarConversion = totalPrice / 56.0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedDollarConversion = decimalFormat.format(dollarConversion);

        System.out.println("Price in Dollars: $" + formattedDollarConversion);

        scanner.close();
    }
}
