package week1;

import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args) {

        double height, weight, bmi;

        // Import Scanner and Take Some Information
        Scanner input = new Scanner(System.in);
        System.out.print("Please,Enter Your Height in Meters: ");
        height = input.nextDouble();
        System.out.print("Please Enter Your Weight in Kilogram:  ");
        weight = input.nextDouble();

        // Calculate BMI and Show Users
        bmi = weight / Math.pow(height, 2);
        System.out.println("Your BMI: " + bmi);
    }
}
