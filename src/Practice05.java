import java.util.Scanner;

/*
Circle Area and Circumference Calculator Program

Write a Java program that takes the radius of a circle from the user and calculates its area and circumference.

Area Formula: pi * r * r

Circumference Formula: 2 * pi * r

Assignment
Write a program that calculates the area of a circle sector with radius r and central angle a.

Use pi = 3.14.

Formula: (pi * r * r * a) / 360
*/
public class Practice05 {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;
        double angle;
        double circumference;
        double area;
        double sectorArea;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");

        radius = input.nextDouble();
        if (radius <= 0) {
            System.out.println("Invalid radius! It must be greater than 0.");
            return;
        }

        System.out.println("Please enter the central angle: ");
        angle = input.nextDouble();
        if (angle < 0 || angle > 360) {
            System.out.println("Invalid angle! It must be between 0 and 360.");
            return;
        }

        circumference = 2 * pi * radius;
        area = pi * radius * radius;
        sectorArea = (pi * radius * radius * angle) / 360;

        System.out.println("Circle circumference: " + circumference);
        System.out.println("Circle area: " + area);
        System.out.println("Sector area: " + sectorArea);
    }
}
