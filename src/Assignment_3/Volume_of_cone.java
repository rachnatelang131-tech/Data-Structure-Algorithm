package Assignment_3;

import java.util.Scanner;

public class Volume_of_cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 10;
        int h = 20;
        double volume = 0.3*3.14*r*r*h;

        System.out.println("volume of cone is.: " + volume);
    }
}
