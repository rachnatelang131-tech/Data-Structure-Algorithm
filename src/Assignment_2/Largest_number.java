package Assignment_2;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first no.: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second no.: ");
        int num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println("Largest no. is: " + num1);
        }else if (num2>num1) {
            System.out.println("Largest no. is: " + num2);
        }else {
            System.out.println("Both numbers are equal");
        }
    }
}
