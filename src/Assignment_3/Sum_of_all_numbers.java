package Assignment_3;

import java.util.Scanner;

public class Sum_of_all_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers. (enter 0 to stop):");
        int num;
        int sum = 0;

        while(true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }
            sum = sum+num;
        }
        System.out.println("Sum of all numbers.: " + sum);
    }


}