package week1;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {

        // define variables
        int nNumber, rNumber, sumN = 1, sumR = 1, sumNR = 1, calculate;

        // import Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The 'N' Number: ");
        nNumber = input.nextInt();
        System.out.print("Enter The 'R' Number: ");
        rNumber = input.nextInt();

        // find nNumber factorial
        for (int i = 1; i <= nNumber; i++) {
            sumN *= i;
        }

        // find rNumber factorial
        for (int i = 1; i <= rNumber; i++) {
            sumR *= i;
        }

        // find nNumber - rNumber factorial
        for (int i = 1; i <= (nNumber - rNumber); i++) {
            sumNR *= i;
        }

        // Finding how many combinations there are
        calculate = sumN / (sumR * sumNR);
        System.out.println("You can make " + calculate + " different choises");


    }
}
