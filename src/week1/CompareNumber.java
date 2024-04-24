package week1;

import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {

        // Define variable
        int number1, number2, number3;

        // Import Scanner and take user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        number1 = input.nextInt();

        System.out.print("Enter The Second Number: ");
        number2 = input.nextInt();

        System.out.print("Enter The Third Number: ");
        number3 = input.nextInt();

        // Compare number and print screen
        if ((number1 > number2) && (number2 > number3)) {
            System.out.println(number3 + " < " + number2 + " < " + number1);
        } else if ((number1 > number3) && (number3 > number2)) {
            System.out.println(number2 + " < " + number3 + " < " + number1);

        } else if ((number2 > number1) && (number1 > number3)) {
            System.out.println(number3 + " < " + number1 + " < " + number2);
        } else if ((number2 > number3) && (number3 > number1)) {
            System.out.println(number1 + " < " + number3 + " < " + number2);
        } else if ((number3 > number1) && (number1 > number2)) {
            System.out.println(number2 + " < " + number1 + " < " + number3);
        } else {
            System.out.println(number1 + " < " + number2 + " < " + number3);
        }
    }
}
