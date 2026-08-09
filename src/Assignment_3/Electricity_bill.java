package Assignment_3;

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed.:  ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units*5;
        }
        else if (units <= 200) {
            bill = units*7;
        }
        else {
            bill = (100*5) + (100*7) + ((units-200)*10);
        }

        System.out.println("Bill is .:" + bill);



    }
}
