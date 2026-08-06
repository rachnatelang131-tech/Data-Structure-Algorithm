package Assignment_2;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        System.out.print("Enter principal amount: ");
        Scanner principal = new Scanner(System.in);
        int p = principal.nextInt();

        System.out.print("Enter rate in percent: ");
        Scanner rate = new Scanner(System.in);
        int r = rate.nextInt();

        System.out.print("Enter time in months: ");
        Scanner time = new Scanner(System.in);
        int t = time.nextInt();

        int Simple_interest = (p * t * r)/100;
        System.out.println(Simple_interest);
    }

}
