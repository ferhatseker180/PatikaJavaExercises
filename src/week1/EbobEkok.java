package week1;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        // define variables
        int number1, number2, ebob = 1, ekok, i = 1;

        // import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        number1 = input.nextInt();
        System.out.print("Enter The Second Number: ");
        number2 = input.nextInt();

        // compare number1 and number2 with if and while loop

        if (number1 < number2) {
            while (i <= number1) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }

        if (number2 < number1) {
            while (i <= number2) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }

        // Ekok formula
        ekok = (number1 * number2) / ebob;

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);

        /*
                // compare number1 and number2 with if and while loop

        if (number1 < number2) {
            for (int i = 1; i <= number1; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
            }

        }

        if (number2 < number1) {
            for (int i = 1; i <= number2; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
            }
        }

         */


    }
}
