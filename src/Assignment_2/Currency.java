package Assignment_2;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount in Rupees: ");
        double rupees = sc.nextDouble();   // First take input

        double USD = rupees / 87.50;       // Then calculate

        System.out.println("Amount in USD: $" + USD);

    }
}
