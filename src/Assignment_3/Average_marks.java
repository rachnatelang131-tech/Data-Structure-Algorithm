package Assignment_3;

import java.util.Scanner;

public class Average_marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter marks " + n + " subjects:");

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for subjects.: " + i );
            int marks = sc.nextInt();
            sum = sum + marks;
        }

        double avg = (double) sum / n;

        System.out.println("Total marks: " + sum);
        System.out.println("Average is: " + avg);
    }
}


