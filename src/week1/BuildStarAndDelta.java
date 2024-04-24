package week1;

import java.util.Scanner;

public class BuildStarAndDelta {
    public static void main(String[] args) {

        // define variables
        int number, i, j;

        // import scanner and take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = input.nextInt();


        // The first loop determines the number of columns
        // The second loop sets the number of spaces
        // Third loop sets stars count
        for (i = 1; i <= number; i++) {
            for (j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // The first loop reduce columns according to rules
        // The second loop sets the number of spaces
        // Third loop reduce stars count

        for (i = number - 1; i >= 1; i--) {
            for (j = 1; j <= number - i; j++)
                System.out.print(" ");
            for (j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
