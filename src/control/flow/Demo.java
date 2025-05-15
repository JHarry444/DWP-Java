package control.flow;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("I:" + i);
        }


        Scanner scan = new Scanner(System.in);
        double num = 0;
        do {
            System.out.println("Please enter a number from 1 to 10:");
            num = Double.parseDouble(scan.nextLine());

            if (num < 1 || num > 10) {
                System.out.println("Invalid num: " + num);
            }
        } while (!(num >= 1 && num <= 10));
        System.out.println("Your number was: " + (num % 1 != 0 ? num : (int) num));

    }
}
