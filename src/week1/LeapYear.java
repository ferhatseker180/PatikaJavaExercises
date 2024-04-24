package week1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // define variable
        int year;
        // import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Year: ");
        year = input.nextInt();

        // Control System
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " isn't a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }

        } else {
            System.out.println(year + " isn't a leap year");
        }
    }
}
