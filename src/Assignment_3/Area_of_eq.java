package Assignment_3;

import java.util.Scanner;

public class Area_of_eq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = 12;

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Area of Equilateral Triangle: " + area);
    }
}

