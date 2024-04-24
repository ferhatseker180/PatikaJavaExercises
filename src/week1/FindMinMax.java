package week1;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {

        // import scanner and ask number
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı girmek istiyorsunuz: ");
        int count = input.nextInt();

        // By default we assign the largest and smallest values
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int i=1;

        // Control and new value assignment
        while (i<=count){
            System.out.print(i + ". Sayıyı Giriniz: ");
            int number = input.nextInt();
            if (number > maxValue){
                maxValue = number;
            }
            if (number < minValue){
                minValue = number;
            }
            i++;
        }
        System.out.println("En büyük: " + maxValue);
        System.out.println("En küçük: " + minValue);
    }
}
