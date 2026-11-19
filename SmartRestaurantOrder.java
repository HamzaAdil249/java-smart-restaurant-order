
import java.util.Scanner;

public class SmartRestaurantOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double DRINK_PRICE = 15.50;

        System.out.print("Customer name: ");
        String name = input.nextLine();

        System.out.print("Customer age: ");
        int age = input.nextInt();

        System.out.print("Meal price: ");
        double mealPrice = input.nextDouble();

        System.out.print("Number of drinks: ");
        int drinks = input.nextInt();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = input.nextBoolean();

        System.out.print("Service rating (1-5): ");
        int rating = input.nextInt();

        if (rating < 1 || rating > 5) {
            System.out.println("Error: Invalid service rating.");
        } else {
            double drinksCost = drinks * DRINK_PRICE;
            double subtotal = mealPrice + drinksCost;
            double discount;

            if (isStudent) {
                discount = subtotal * 0.10;
            } else if (age >= 60) {
                discount = subtotal * 0.05;
            } else {
                discount = 0;
            }

            double afterDiscount = subtotal - discount;
            double tip;

            if (rating == 4 || rating == 5) {
                tip = afterDiscount * 0.10;
            } else {
                tip = 0;
            }

            double finalBill = afterDiscount + tip;
            int wholeAmount = (int) finalBill;

            System.out.println("\nSMART RESTAURANT");
            System.out.println("Customer: " + name);
            System.out.printf("Meal: $%.2f%n", mealPrice);
            System.out.printf("Drinks: $%.2f%n", drinksCost);
            System.out.printf("Discount: $%.2f%n", discount);
            System.out.printf("Tip: $%.2f%n", tip);
            System.out.printf("Final bill: $%.2f%n", finalBill);
            System.out.println("Whole amount: $" + wholeAmount);
        }

        input.close();
    }
}
