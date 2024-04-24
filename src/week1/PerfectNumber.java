package week1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //
        // define variables
        int number, i=1, sum=0;

        // import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Your Number: ");
        number = input.nextInt();

        // The number must be positive so we check
        while (number<=0){
            System.out.print("Enter The Your Number: ");
            number = input.nextInt();
        }

        // find common divisor
        while (i<number){
            if (number%i==0){
                sum += i;
            }
            i++;
        }

        // Give output
        if (sum == number){
            System.out.println("Bu sayı mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }

    }
}
