package week1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Find an Armstrong Number
        int number, stepCount = 0, tempNumber, stepValue,result=0,stepPow;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
        number = input.nextInt();
        tempNumber = number;

        // find digit count
        while (tempNumber!=0){
            tempNumber /= 10;
            stepCount++;
        }

        tempNumber = number;

        while (tempNumber != 0){
            stepValue = tempNumber % 10;
            stepPow = 1;
            for (int i= 1; i<=stepCount; i++){
                stepPow *= stepValue;
            }
            result += stepPow;
            tempNumber /= 10;
        }

        if (result == number){
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " isn't an Armstrong Number");
        }

       // To find the last digit of a number, its mode is taken by 10.



        // found sum of numbers in the step. This is shortcut.

      while (number != 0){
          stepCount = number % 10;

          sum += stepCount;
          number /= 10;
      }

        System.out.println("Sum of numbers in the step = " + sum);


    }
}
