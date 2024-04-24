package week2;

import java.util.Scanner;

public class VeritifyIdentity {
    public static void main(String[] args) {

        String[][] data1 = {{"Ali","Veli","12345678912"},{"Ferhat","Şeker","14725836998"}};

        String choose = "";

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("What is your name: ");
            String name = input.nextLine();
            System.out.print("What is your surname: ");
            String surname = input.nextLine();

            boolean isCheck = false;
            String tc = "";

            for (String[] value : data1) {
                if (value[0].equals(name) && value[1].equals(surname)) {
                    isCheck = true;
                    tc = value[2];
                    break;
                } else {
                    isCheck = false;
                }
            }
            if (isCheck == true){
                String hideTC = tc.substring(0,8) + "***";
                System.out.println("TC ID: " + hideTC );
                System.out.print("What are the last 3 digits of your ID number: ");
                String userTc = input.nextLine();
                if (userTc.equals(tc.substring(8))){
                    System.out.println("Doğru TC Kimlik Numarası girdiniz.");
                    System.out.print("Yapmak istediğin başka işlem yoksa q tuşuna bas: ");
                     choose = input.nextLine();
                } else {
                    System.out.println("Hatalı TC Kimlik Numarası girdiniz.");
                    System.out.print("Yapmak istediğin başka işlem yoksa q tuşuna bas: ");
                    choose = input.nextLine();
                }


            } else {
                System.out.println("Hatalı veri");
                System.out.print("Yapmak istediğin başka işlem yoksa q tuşuna bas: ");
                choose = input.nextLine();
            }


        }while (!choose.equals("q") );




    }
}
