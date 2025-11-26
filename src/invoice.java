import java.util.Scanner;

public class invoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ----- BILL TO -----
        System.out.print("Enter Bill To Name: ");
        String billName = input.nextLine();
        System.out.print("Enter Bill To Address Line 1: ");
        String billAddr1 = input.nextLine();
        System.out.print("Enter Bill To Address Line 2: ");
        String billAddr2 = input.nextLine();
        System.out.print("Enter Bill To GSTIN: ");
        String billGST = input.nextLine();
        System.out.print("Enter Bill To Contact: ");
        String billPhone = input.nextLine();
        System.out.print("Enter Bill To Email: ");
        String billEmail = input.nextLine();

        // ----- SHIP TO -----
        System.out.print("Enter Ship To Name: ");
        String shipName = input.nextLine();
        System.out.print("Enter Ship To Address Line 1: ");
        String shipAddr1 = input.nextLine();
        System.out.print("Enter Ship To Address Line 2: ");
        String shipAddr2 = input.nextLine();
        System.out.print("Enter Ship To GSTIN: ");
        String shipGST = input.nextLine();
        System.out.print("Enter Ship To Contact: ");
        String shipPhone = input.nextLine();
        System.out.print("Enter Ship To Email: ");
        String shipEmail = input.nextLine();

        // ----- PRODUCT 1 -----
        System.out.print("Product 1 Code: ");
        String c1 = input.nextLine();
        System.out.print("Product 1 Name: ");
        String n1 = input.nextLine();
        System.out.print("HSN: ");
        String h1 = input.nextLine();
        System.out.print("Quantity: ");
        int q1 = input.nextInt();
        System.out.print("Rate: ");
        double r1 = input.nextDouble();
        double a1 = q1 * r1;

        input.nextLine(); // clear

        // ----- PRODUCT 2 -----
        System.out.print("Product 2 Code: ");
        String c2 = input.nextLine();
        System.out.print("Product 2 Name: ");
        String n2 = input.nextLine();
        System.out.print("HSN: ");
        String h2 = input.nextLine();
        System.out.print("Quantity: ");
        int q2 = input.nextInt();
        System.out.print("Rate: ");
        double r2 = input.nextDouble();
        double a2 = q2 * r2;

        input.nextLine();

        // ----- PRODUCT 3 -----
        System.out.print("Product 3 Code: ");
        String c3 = input.nextLine();
        System.out.print("Product 3 Name: ");
        String n3 = input.nextLine();
        System.out.print("HSN: ");
        String h3 = input.nextLine();
        System.out.print("Quantity: ");
        int q3 = input.nextInt();
        System.out.print("Rate: ");
        double r3 = input.nextDouble();
        double a3 = q3 * r3;

        input.nextLine();

        // ----- PRODUCT 4 -----
        System.out.print("Product 4 Code: ");
        String c4 = input.nextLine();
        System.out.print("Product 4 Name: ");
        String n4 = input.nextLine();
        System.out.print("HSN: ");
        String h4 = input.nextLine();
        System.out.print("Quantity: ");
        int q4 = input.nextInt();
        System.out.print("Rate: ");
        double r4 = input.nextDouble();
        double a4 = q4 * r4;

        input.nextLine();

        // ----- PRODUCT 5 -----
        System.out.print("Product 5 Code: ");
        String c5 = input.nextLine();
        System.out.print("Product 5 Name: ");
        String n5 = input.nextLine();
        System.out.print("HSN: ");
        String h5 = input.nextLine();
        System.out.print("Quantity: ");
        int q5 = input.nextInt();
        System.out.print("Rate: ");
        double r5 = input.nextDouble();
        double a5 = q5 * r5;

        input.nextLine();

        // ----- PRODUCT 6 -----
        System.out.print("Product 6 Code: ");
        String c6 = input.nextLine();
        System.out.print("Product 6 Name: ");
        String n6 = input.nextLine();
        System.out.print("HSN: ");
        String h6 = input.nextLine();
        System.out.print("Quantity: ");
        int q6 = input.nextInt();
        System.out.print("Rate: ");
        double r6 = input.nextDouble();
        double a6 = q6 * r6;

        input.nextLine();

        // ----- PRODUCT 7 -----
        System.out.print("Product 7 Code: ");
        String c7 = input.nextLine();
        System.out.print("Product 7 Name: ");
        String n7 = input.nextLine();
        System.out.print("HSN: ");
        String h7 = input.nextLine();
        System.out.print("Quantity: ");
        int q7 = input.nextInt();
        System.out.print("Rate: ");
        double r7 = input.nextDouble();
        double a7 = q7 * r7;

        double total = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        double discount = total * 0.006368;
        double grand = total - discount;

        // -------- OUTPUT --------
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.println(String.format("%-60s%s", "Bill To:", "Ship To:"));
        System.out.println(String.format("%-60s%s", billName, shipName));
        System.out.println(String.format("%-60s%s", billAddr1, shipAddr1));
        System.out.println(String.format("%-60s%s", billAddr2, shipAddr2));
        System.out.println(String.format("%-60s%s", "GSTIN: " + billGST, "GSTIN: " + shipGST));
        System.out.println(String.format("%-60s%s", "Contact: " + billPhone, "Contact: " + shipPhone));
        System.out.println(String.format("%-60s%s", "Email: " + billEmail, "Email: " + shipEmail));

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.println("Payment Date: 7 days from date of delivery                                  Payment Terms: 100% against invoice");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.println("S.No  Code   Product Name                HSN        Qty   Rate     Amount");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.printf("1     %-6s %-28s %-10s %-5d %-8.2f %.2f%n", c1, n1, h1, q1, r1, a1);
        System.out.printf("2     %-6s %-28s %-10s %-5d %-8.2f %.2f%n", c2, n2, h2, q2, r2, a2);
        System.out.printf("3     %-6s %-28s %-10s %-5d %-8.2f %.2f%n", c3, n3, h3, q3, r3, a3);
        System.out.printf("4     %-6s %-28s %-10s %-5d %-8.2f %.2f%n", c4, n4, h4, q4, r4, a4);
        System.out.printf("5     %-6s %-28s %-10s %-5d %-8.2f %.2f%n", c5, n5, h5, q5, r5, a5);
        System.out.printf("6     %-6s %-28s %-10s %-5d %-8.2f %.2f%n", c6, n6, h6, q6, r6, a6);
        System.out.printf("7     %-6s %-28s %-10s %-5d %-8.2f %.2f%n", c7, n7, h7, q7, r7, a7);

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%90s %.2f%n", "Total:", total);
        System.out.printf("%90s %.2f%n", "Discount (0.6368%):", discount);
        System.out.printf("%90s %.2f%n", "Grand Total:", grand);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
}