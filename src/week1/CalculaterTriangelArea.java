package week1;

import java.util.Scanner;

public class CalculaterTriangelArea {
    public static void main(String[] args) {

        // Defining Triangle Egde Length variables
        int firstEdge, secondEdge, thirdEdge;
        // Defining Triangel Half Perimeter, Perimeter and Area variables
        double u, perimeter, area;

        // İmport Scanner and we ask triangle corners(edges) and we are transfering the value into our variables
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The First Edge Length");
        firstEdge = input.nextInt();
        System.out.println("Enter The Second Edge Length");
        secondEdge = input.nextInt();
        System.out.println("Enter The Third Edge Length");
        thirdEdge = input.nextInt();

        // Calculate Perimeter and Area
        u = ((double) (firstEdge + secondEdge + thirdEdge) / 2);
        perimeter = 2 * u;
        area = Math.sqrt(u * (u - firstEdge) * (u - secondEdge) * (u - thirdEdge));
        // (sqrt): It allows us to take the square root of the value found.
        System.out.println("Triangle Perimeter: " + perimeter);
        System.out.println("Triangel Area: " + area);
    }
}
