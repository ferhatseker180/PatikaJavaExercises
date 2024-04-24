package week1;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        // define variables
        int birthdayYear, calculate;

        // import scanner and transform value into the variable
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your Birthday Year: ");
        birthdayYear = input.nextInt();

        // we take mod with 12 because this is how to find the Chinese zodiac
        calculate = birthdayYear % 12;

        switch (calculate){
            case 0 :
                System.out.println("Your Chinese Zodiac is Monkey");
                break;
            case 1 :
                System.out.println("Your Chinese Zodiac is Rooster");
                break;
            case 2 :
                System.out.println("Your Chinese Zodiac is Dog");
                break;
            case 3 :
                System.out.println("Your Chinese Zodiac is pig");
                break;
            case 4 :
                System.out.println("Your Chinese Zodiac is Mouse");
                break;
            case 5 :
                System.out.println("Your Chinese Zodiac is Ox");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac is Tiger");
                break;
            case 7 :
                System.out.println("Your Chinese Zodiac is Rabbit");
                break;
            case 8 :
                System.out.println("Your Chinese Zodiac is Dragon");
                break;
            case 9 :
                System.out.println("Your Chinese Zodiac is Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac is Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac is Sheep");




        }
    }
}
