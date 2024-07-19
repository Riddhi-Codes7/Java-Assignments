import java.util.Scanner;
public class BillingProcess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        String[] Names = new String[numberOfProducts];
        double[] Prices = new double[numberOfProducts];
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Enter the name of product " + (i + 1) + ": ");
            Names[i] = sc.nextLine();
            System.out.print("Enter the price of " + Names[i] + ": ");
            Prices[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.print("Do you want to add GST? (Y/N): ");
        char gstChoice = sc.next().charAt(0);
        double gstPer = 0.0;
        if (gstChoice == 'Y' || gstChoice == 'y') {
            System.out.print("Enter the GST percentage: ");
            gstPer = sc.nextDouble();
        }
        double Price = 0.0;
        for (double price : Prices) {
            Price += price;
        }
        double gstAmount = Price * (gstPer / 100);
        double finalPrice = Price + gstAmount;

        System.out.println("\nFinal Bill:");
        System.out.printf("%-20s %-10s\n", "Product Name", "Price");
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.printf("%-20s %-10.2f\n", Names[i], Prices[i]);
        }
        System.out.println("---------------------------");
        System.out.printf("%-20s %-10.2f\n", "Total Price", Price);
        if (gstChoice == 'Y' || gstChoice == 'y') {
            System.out.printf("%-20s %-10.2f\n", "GST (" + gstPer + "%)", gstAmount);
        }

        System.out.printf("%-20s %-10.2f\n", "Final Price", finalPrice);
    }
}
