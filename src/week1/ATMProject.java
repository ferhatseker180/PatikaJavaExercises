package week1;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {

        // define variable
        String userName, password;
        int right = 3, balance = 2000, select, price;

        // import scanner
        Scanner input = new Scanner(System.in);

        // control your right
        while (right > 0) {
            System.out.print("Enter Your Username: ");
            userName = input.nextLine().toLowerCase();
            System.out.print("Enter Your Password: ");
            password = input.nextLine().toLowerCase();

            // check account information
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello and welcome to Robin Hood bank");

                // choose your action
                do {
                    System.out.print("1 -> Deposit Money \n2 -> Withdraw Money \n3 -> Query Balance\n4 -> Quit Account\nWhat Is Your Choose: ");
                    select = input.nextInt();
                    System.out.print(" ");

                    switch (select) {
                        case 1:
                            System.out.print("Amount of money: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of money: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= price;
                                System.out.println("Available balance = " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Available balance = " + balance);
                            break;
                        case 4:
                            System.out.println("See you again.");
                            break;
                    }

                } while (select != 4);

                // If your user information is incorrect
            } else {
                right--;
                System.out.println("Incorrect username and password. Please try again.");

                switch (right) {
                    case 0:
                        System.out.println("Your account has been blocked, please contact the bank.");
                        break;
                    case 1:
                        System.out.println("Remaining right: " + right);
                        break;
                    case 2:
                        System.out.println("Remaining right: " + right);
                        break;
                }

            }
        }


    }
}
