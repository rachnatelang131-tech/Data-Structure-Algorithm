package Assignment_2;

import java.util.Scanner;

public class rupees_dollar {
    public static void main(String[] args) {
        System.out.print("Enter the amount...");
        Scanner input = new Scanner(System.in);
        int rup = input.nextInt();

        double dol = rup/95.13;
        System.out.println(rup + "rupees is equal to " + dol + "$.");
    }
}
