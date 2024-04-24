package week1;

import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {

        // Defining variable
        int r;
        double pi = 3.14, a, perimeter, area, circleSliceArea;

        // Import Scanner, Users will enter the necessary information about the circle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Circle Radius: ");
        r = input.nextInt();

        System.out.print("Enter The Circle Center Angle: ");
        a = input.nextDouble();

        // Calculate Circle Perimeter, Area and Slice Area.

        perimeter = 2 * pi * r;
        System.out.println("Circle Perimeter: " + perimeter);

        area = pi * Math.pow(r, 2);
        System.out.println("Circle Area: " + area);

        circleSliceArea = ((area * a) / 360);
        System.out.println("Circle Slice Area: " + circleSliceArea);

    }
}
