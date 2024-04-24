package week1;

import java.util.Scanner;

public class ReverseDelta {
    public static void main(String[] args) {

        // define variable
        int step,star;

        // import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("How many steps does an inverted triangle have: ");
        step = input.nextInt();

        // example if you enter 5, you will see 9 star
         star = step * 2 - 1;


        for (int i = step; i >= 1; i--) {
            for (int j = 0; j < (step - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            star -= 2;
            System.out.println();
        }
        }



}
