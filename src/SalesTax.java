import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Place enter the price of the purchase: $");
        double purchasePrice = input.nextDouble();
        double salesTax = purchasePrice * 0.05;
        double totalCost = purchasePrice + salesTax;

        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("Your total cost is: $" + totalCost);
    }
}