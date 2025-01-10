import java.util.Scanner;


public class ShoppingCartCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the customer's name? ");
        String CustomerName = sc.next();
        System.out.println("What is the sales tax rate (%)? ");
        double SalesTaxRate = sc.nextDouble();
        System.out.println("How many items are being purchased? ");
        int numOfItems = sc.nextInt();

        double subtotal = 0;
        for (int i = 1; i <= numOfItems; i++) {
            System.out.println("Enter item#" + i + " price : ");
            double price = sc.nextDouble();
            System.out.println("Enter item#" + i + " quantity : ");
            System.out.println();
            int quantity = sc.nextInt();
            subtotal = price * quantity;
        }
        printBill(CustomerName, subtotal, SalesTaxRate);
    }

    //     Method to calculate total and print the customer's bill
    public static void printBill(String CustomerName, double beforeTaxTotal, double taxRate) {
        double saleTax = beforeTaxTotal * (taxRate / 100);
        double total = beforeTaxTotal + saleTax;

        System.out.printf("Billing Statement for %s:\n", CustomerName);
        System.out.printf("Subtotal: $%.2f\n", beforeTaxTotal);
        System.out.printf("Sales Tax: $%.2f\n", saleTax);
        System.out.printf("Total: $%.2f\n", total);
    }
}