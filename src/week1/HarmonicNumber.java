package week1;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        // define variable
        int number;
        double result = 0.0;

        // Import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = input.nextInt();

        // Find harmonic numbers and sum all of them
        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("Harmonic Numbers sum = " + result);


    }
}
