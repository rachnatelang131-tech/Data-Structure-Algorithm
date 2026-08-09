package Assignment_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers:");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        double avg = (double) sum / n;

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
    }
}

