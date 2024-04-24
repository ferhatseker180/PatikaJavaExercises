package week1;

import java.util.Scanner;

public class SumSpecificNumber {
    public static void main(String[] args) {

        // Define variables
        int number;
        double sum = 0;

        // import scanner
        Scanner input = new Scanner(System.in);

        // Even if user's input isn't obey to rules, we want to run one times so we use do while loop
        // We identify and add numbers that are both even and multiples of 4.
        do {
            System.out.print("Enter The Number: ");
            number = input.nextInt();

            if (number % 4 == 0) {
                sum += number;
            }

        } while (number % 2 == 0);

        System.out.println(sum);
    }
}
