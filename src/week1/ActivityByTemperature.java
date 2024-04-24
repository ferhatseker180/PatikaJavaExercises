package week1;

import java.util.Scanner;

public class ActivityByTemperature {
    public static void main(String[] args) {

        // define temperature variable
        int heat;

        // import scanner and take data
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Weather Temperature: ");
        heat = input.nextInt();

        //check heat and offer activity
        if (heat < 5) {
            System.out.println("You Should Ski");
        } else if (heat > 5 && heat == 15 && heat < 16) {
            System.out.println("You Should Go Cinema And Picnic");
        } else if (heat > 5 && heat <= 15) {
            System.out.println("You Should Go Cinema");
        } else if (heat >= 15 && heat <= 25) {
            System.out.println("You Should Go Picnic");
        } else {
            System.out.println("You Should Go Swimming");
        }
    }
}
