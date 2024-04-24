package week1;

import java.util.Scanner;

public class FindingMultiplesOfNumber {
    public static void main(String[] args) {

        // define variable
        int number;

        // import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        number = input.nextInt();

        // Identify numbers that are multiples of 4
        for (int i=1; i<=number; i*=4){
            System.out.println("Numbers that are multiples : " + i);
        }

        // leave a blank
        System.out.println("*****");

        // Identify numbers that are multiples of 5
        for (int i=1; i<=number; i*=5){
            System.out.println("Numbers that are multiples : " + i);
        }

    }
}
