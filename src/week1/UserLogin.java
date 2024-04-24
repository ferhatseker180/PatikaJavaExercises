package week1;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        // Default username and password have been assigned.
        // toLowerCase: command was used to avoid case mismatches.
        String defaultName = "patika".toLowerCase(), defaultPassword = "java".toLowerCase();
        String userName, password;
        String newPassword;
        int choose;

        // Scanner imported and We used the lowercase code to avoid letter mismatch in the newly received data.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Username: ");
        userName = input.nextLine().toLowerCase();

        System.out.print("Enter Your Password: ");
        password = input.nextLine().toLowerCase();

        // Username and password control
        // If the username or password does not match, the code below will work.
        if (!userName.equals(defaultName) || (!password.equals(defaultPassword))) {
            System.out.println("Uncorrect Password");
            System.out.print("Do you want to reset the password?\n Yes-1, No-2: ");
            // The user will decide whether they want to reset his password or not
            // If the password you entered is the same as the old one, you will receive a warning that your password could not be changed.
            // The question will continue to be asked with a do-while loop until the appropriate password is entered.
            choose = input.nextInt();
            if (choose == 1) {
                do {
                    System.out.println("Enter The New Password: ");
                    newPassword = input.next().toLowerCase();
                    if (newPassword.equals(defaultPassword)) {
                        System.out.println("The password could not be created, please enter another password.");
                    } else {
                        defaultPassword = newPassword;
                        System.out.println("The password has been changed successfully.");
                        break;
                    }
                } while (true);
            }  // If the user does not want to renew the password, it will be sent to the login page.
            else if (choose == 2) {
                System.out.println("You do not want to change the password, you are directed to the login page");
            } else {
                System.out.println("You entered an invalid option. Password change has been cancelled.");
            }
        } else {
            System.out.println("Login is successful, you are directed to the page...");
        }
    }
}
