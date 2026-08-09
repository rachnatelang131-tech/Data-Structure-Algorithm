package Assignment_3;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year.:");
        int year = sc.nextInt();

        if (year % 4 == 0 ) {
            System.out.println("Given year is leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
