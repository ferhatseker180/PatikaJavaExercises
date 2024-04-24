package week1;
import java.util.Scanner;
public class FindEvenNumber {
    public static void main(String[] args) {

        // define variable
        // We use count because we want to find our number's average so we must divide total number's count.
        int number;
        double sum = 0, count = 0, average;

        // import scanner and we take user's input.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = input.nextInt();

        // In the for loop, we find numbers that are multiples of 12 up to the number received from the user.
        // We will use how many there are in calculating the average.
        for (int i = 0; i <= number; i++) {
            if (i % 12 != 0) {
                continue;
            }
            System.out.println(i);
            sum += i;
            count++;
        }

        average = sum / count;
        System.out.println("Sum of the numbers = " + sum);
        System.out.println("Count of the numbers = " + count);
        System.out.println("Average of the numbers = " + average);

    }
}
