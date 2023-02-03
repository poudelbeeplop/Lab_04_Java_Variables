import java.util.Scanner;

public class YearlyMaintenanceCost
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the cost of winter maintenance: $");
        double winterCost = input.nextDouble();

        System.out.print("Please enter the cost of spring maintenance: $");
        double springCost = input.nextDouble();

        System.out.print("Please enter the cost of fall maintenance: $");
        double fallCost = input.nextDouble();

        System.out.print("Please enter the cost of summer maintenance: $");
        double summerCost = input.nextDouble();

        double totalCost = winterCost + springCost + fallCost + summerCost;

        System.out.println("Total Yearly Maintenance Cost: $" + totalCost);

    }


}
