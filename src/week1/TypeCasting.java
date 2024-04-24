package week1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // import scanner
        Scanner input = new Scanner(System.in);
        // Take number from User
        System.out.print("Enter The Integer Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the Double Number: ");
       double number2 = input.nextDouble();

       // Convert process
       int newNumber1 = (int) number2;
        System.out.println("Double Converted to Int: " + newNumber1);

        double newNumber2 = number1;
        System.out.println("Int Converted To Double " + newNumber2);



    }
}
