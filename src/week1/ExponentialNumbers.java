package week1;

import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {

        // Define variable
        int floorNumber,upperNumber,total = 1;

        // Import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Floor Number: ");
        floorNumber = input.nextInt();
        System.out.print("Enter The Upper Number: ");
        upperNumber = input.nextInt();

        // Exponentiation Algorithm
        for (int i=1; i<=upperNumber; i++){
            total *= floorNumber;
        }
        System.out.println(floorNumber + "^" + upperNumber + " = " + total);

    }
}
