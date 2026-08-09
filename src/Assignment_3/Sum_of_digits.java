package Assignment_3;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer.: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum =  0;
        while(n>0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum of digits is.: " + sum);


    }
}
