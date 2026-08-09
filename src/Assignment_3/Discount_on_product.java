package Assignment_3;

import java.util.Scanner;

public class Discount_on_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of product.: ");
        double price = sc.nextDouble();

        System.out.println("Enter the discount percentage.: "); // in percentage
        double discount = sc.nextInt();

        double discount_amount = (price * discount)/100;
        double final_price = price - discount_amount;

        System.out.println("Discount is.:" + discount_amount);
        System.out.println("Final amount is.:" + final_price);

    }
}
