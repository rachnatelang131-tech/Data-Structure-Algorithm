package Assignment_2;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even number ");
        }
        else{
            System.out.println(num + " is odd number ");
        }


    }
}
