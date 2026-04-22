/*
Right Triangle Hypotenuse Calculator Program

Write a Java program that takes the lengths of the perpendicular sides from the user and calculates the hypotenuse.

Assignment
Write a program that takes the three side lengths of a triangle from the user and calculates its area.

Formula
Triangle perimeter = 2 * u

u = (a + b + c) / 2

Area * Area = u * (u - a) * (u - b) * (u - c)
* */

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        double sideA, sideB, sideC;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter side A: ");

        sideA = input.nextDouble();
        if (sideA <= 0) {
            System.out.println("Invalid length! It must be greater than 0.");
            return;
        }

        System.out.println("Please enter side B: ");
        sideB = input.nextDouble();
        if (sideB <= 0) {
            System.out.println("Invalid length! It must be greater than 0.");
            return;
        }

        System.out.println("Please enter side C: ");
        sideC = input.nextDouble();
        if (sideC <= 0) {
            System.out.println("Invalid length! It must be greater than 0.");
            return;
        }

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Invalid triangle! The side lengths do not form a triangle.");
            return;
        }

        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        System.out.println("Triangle perimeter: " + 2 * semiPerimeter);
        System.out.println("Triangle area: " + area);

    }
}
