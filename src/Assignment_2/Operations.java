package Assignment_2;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        System.out.print("Enter the first no.: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.print("Enter the operator: ");
        Scanner op = new Scanner(System.in);
        char operator = op.next().charAt(0);

        System.out.print("Enter the second no.: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        int Addition = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        if (operator == '+'){
            System.out.println(Addition);
        }
        else if (operator == '-'){
            System.out.println(substraction);
        }
        else if (operator == '*'){
            System.out.println(multiplication);
        }
        else if (operator == '/'){
            if (num2 != 0) {
                System.out.println(division);
            }
            else {
                System.out.println("can't be divided...");
            }

        }
        else {
            System.out.println("operator don't exist...");
        }


    }
}
