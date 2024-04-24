package week1;

import java.util.Scanner;

public class PlanePrice {

    public static void main(String[] args) {

        double perKm = 0.10, km, fixedPrice, discountAge, oneRoundTripPrice = 0.2, finalPrice;
        int age, direction;

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the KM info: ");
        km = input.nextDouble();
        System.out.print("Please, enter your age: ");
        age = input.nextInt();
        System.out.print("Do you want a one-way ticket or a round-trip ticket?\nWarning! You must enter the number\n1=>OneWay 2=>OneRoundTrip: ");
        direction = input.nextInt();

        fixedPrice = km * perKm;


        if (km > 0 && age >= 0 && (direction == 1 || direction == 2)) {
            switch (direction) {
                case 1:
                    System.out.println("Normal Price: " + fixedPrice + " TL");

                    if (age < 12) {
                        discountAge = fixedPrice * 0.5;
                        System.out.println("Age Discount: " + discountAge + " TL");
                        finalPrice = fixedPrice - discountAge;
                        System.out.print("Price to pay: " + finalPrice + " TL");

                    } else if (age >= 12 && age <= 24) {
                        discountAge = fixedPrice * 0.1;
                        System.out.println("Age Discount: " + discountAge + " TL");
                        finalPrice = fixedPrice - discountAge;
                        System.out.print("Price to pay: " + finalPrice + " TL");

                    } else if (age > 65) {
                        discountAge = fixedPrice * 0.3;
                        System.out.println("Age Discount: " + discountAge + " TL");
                        finalPrice = fixedPrice - discountAge;
                        System.out.print("Price to pay: " + finalPrice + " TL");

                    } else {
                        finalPrice = fixedPrice;
                        System.out.println("No age discount");
                        System.out.print("Price to pay: " + finalPrice + " TL");
                    }
                    break;

                case 2:
                    System.out.println("Normal Price: " + fixedPrice + " TL");

                    if (age < 12) {
                        discountAge = fixedPrice * 0.5;
                        System.out.println("Age Discount: " + discountAge + " TL");
                        finalPrice = ((fixedPrice - discountAge) - ((fixedPrice - discountAge) * oneRoundTripPrice)) * 2;
                        System.out.print("Price to pay: " + finalPrice + " TL");

                    } else if (age >= 12 && age <= 24) {
                        discountAge = fixedPrice * 0.1;
                        System.out.println("Age Discount: " + discountAge + " TL");
                        finalPrice = ((fixedPrice - discountAge) - ((fixedPrice - discountAge) * oneRoundTripPrice)) * 2;
                        System.out.print("Price to pay: " + finalPrice + " TL");

                    } else if (age > 65) {
                        discountAge = fixedPrice * 0.3;
                        System.out.println("Age Discount: " + discountAge + " TL");
                        finalPrice = ((fixedPrice - discountAge) - ((fixedPrice - discountAge) * oneRoundTripPrice)) * 2;
                        System.out.print("Price to pay: " + finalPrice + " TL");

                    } else {
                        discountAge = 0;
                        finalPrice = ((fixedPrice - discountAge) - ((fixedPrice - discountAge) * oneRoundTripPrice)) * 2;
                        System.out.println("No age discount");
                        System.out.print("Price to pay: " + finalPrice + " TL");
                    }
                    break;
            }

        } else {
            System.out.print("Uncorrect Information");
        }
    }

}
