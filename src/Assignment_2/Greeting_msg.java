package Assignment_2;

import java.util.Scanner;

public class Greeting_msg {
   public static void main(String[] args) {
       System.out.print("Enter your name: ");
       Scanner input = new Scanner(System.in);
       String name = input.next();

       System.out.println("Hey " + name + " !!    Glad to see you here.....");

    }
}
