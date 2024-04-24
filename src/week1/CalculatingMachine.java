package week1;

import java.util.Scanner;

public class CalculatingMachine {
    public static void main(String[] args) {

        // Define variable name
        // I choosed double type because if first number smaller than second number, we might encounter some problems.
        // If first number smaller than second number, we can't divide him but if we use double type, we can divide it
        double sayi1, sayi2, result;
        // Operator must be int because switch can not allow double type also we don't need double type.
        int operator;

        // Take 2 number with Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Please,Enter The First Number: ");
        sayi1 = input.nextDouble();
        System.out.print("Please,Enter The Second Number: ");
        sayi2 = input.nextDouble();

        // Which operator do you use? We are taking answer.
        System.out.println("Which operator do you want to use?\nYou must enter the them number\n1-Sum\n2-Reduce\n3-Multiplication\n4-Divide");
        System.out.print("Your choise: ");
        operator = input.nextInt();

        // Check operator and give result
        switch (operator) {
            case 1:
                result = sayi1 + sayi2;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = sayi1 - sayi2;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = sayi1 * sayi2;
                System.out.println("Result = " + result);
                break;
            case 4:
                result = sayi1 / sayi2;
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("Wrong Choose, You Must Enter The Correct Number");
        }


    }
}
