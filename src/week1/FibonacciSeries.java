package week1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // define variable
        int count, firstNumber=0,secondNumber=1;

        // import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements of a Fibonacci series do you want: ");
        count = input.nextInt();

        // we must indicate first and second number.
        // The previous element must be replaced by the last element
        for (int i=0; i<count; i++){
            System.out.print(firstNumber + "  ");
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;

        }

    }
}
