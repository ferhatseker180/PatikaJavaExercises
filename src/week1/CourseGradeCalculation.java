package week1;

import java.util.Scanner;

public class CourseGradeCalculation {
    public static void main(String[] args) {

        // Define variables
        int maths, physics, turkish, chemistry, music;
        double validGrade = 0, sum = 0, average;

        // Import Scanner and take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Maths Note: ");
        maths = input.nextInt();

        // Check whether the incoming data is in the correct range.
        // If it is an invalid value, it shouldn't be included in the calculation.

        if (maths >= 0 && maths <= 100) {
            sum += maths;
            validGrade++;
        }

        System.out.print("Enter The Physics Note: ");
        physics = input.nextInt();

        if (physics >= 0 && physics <= 100) {
            sum += physics;
            validGrade++;
        }

        System.out.print("Enter The Turkish Note: ");
        turkish = input.nextInt();

        if (turkish >= 0 && turkish <= 100) {
            sum += turkish;
            validGrade++;
        }

        System.out.print("Enter The Chemistry Note: ");
        chemistry = input.nextInt();

        if (chemistry >= 0 && chemistry <= 100) {
            sum += chemistry;
            validGrade++;
        }

        System.out.print("Enter The Music Note: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            sum += music;
            validGrade++;
        }

        // We check if the number of valid values is greater than 0
        if (validGrade > 0) {
            average = sum / validGrade;
            System.out.println("Your Average: " + average);

            if (average >= 55) {
                System.out.println("You passed the class");
            } else {
                System.out.println("You failed. You must repeat a grade");
            }

        } else {
            System.out.println("Please, Enter The Valid Notes");
        }


    }
}
