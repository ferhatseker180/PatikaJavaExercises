package week1;

import java.util.Scanner;

public class GroceryStoreCalculate {
    public static void main(String[] args) {

        // Define perKG price
        double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, aubergine = 5.00;
        // Define users Input Variable
        double pearKg, appleKg, tomatoesKg, bananaKg, aubergineKg, price;

        // Import Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("How many kilos of pears will you buy: ");
        pearKg = input.nextDouble();

        System.out.print("How many kilos of apple will you buy: ");
        appleKg = input.nextDouble();

        System.out.print("How many kilos of tomatoes will you buy: ");
        tomatoesKg = input.nextDouble();

        System.out.print("How many kilos of banana will you buy: ");
        bananaKg = input.nextDouble();

        System.out.print("How many kilos of aubergine will you buy: ");
        aubergineKg = input.nextDouble();

        // Calculate Total Price
        price = ((pear * pearKg) + (appleKg * apple) + (tomatoesKg * tomatoes) + (bananaKg * banana) + (aubergineKg * aubergine));
        System.out.println("Total Price: " + price + "TL");
    }
}
