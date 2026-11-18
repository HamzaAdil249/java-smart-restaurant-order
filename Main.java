import java.util.Scanner;

public class Main {

  final double drinkPrices = 15.50;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String customrName = "";
    int customrAge = 0;
    double priceMeal = 0;
    boolean isStudent = false;
    boolean isSenior = false;
    double tipAmount = 0;
    int numberOfDrinks = 0;

    System.out.print("Enter Your Name: ");
    customrName = scanner.nextLine();

    System.out.print("Enter Your Age: ");
    customrAge = scanner.nextInt();

    

    // System.out.print("Your Name: " + customrName + " ,Your Age: " + customrAge);

    // System.out.println("Hello World");
  }
}