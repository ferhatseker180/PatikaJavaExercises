package week1;

import java.util.Scanner;

public class CalculateKDV {
    public static void main(String[] args) {

        // Defining variable
        double price, kdvRate, kdvPrice, newPrice;

        // İmport Scanner and We Want To Take Product Price
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Product Price");
        price = input.nextDouble();

        // Raw price of the product entered by the user
        System.out.println("Your Product Raw Price: " + price);

        // Finding the KDV rate that varies depending on the price of the product
        kdvRate = ((price >= 1000) ? 0.08 : 0.18);
        System.out.println("KDV Rate: " + kdvRate);

        kdvPrice = price * kdvRate;
        System.out.println("KDV Price: " + kdvPrice);

        // Finding the new price of the product by adding KDV
        newPrice = price + kdvPrice;
        System.out.println("Price Including KDV " + newPrice);
    }
}
