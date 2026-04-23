import java.util.Scanner;

/*
Body Mass Index Calculator

Write a Java program that takes the user's height and weight, calculates the Body Mass Index (BMI), and prints it to the screen.

Formula
Weight (kg) / (Height (m) * Height (m))

Example Output
Please enter your height in meters: 1.72
Please enter your weight in kilograms: 105
Your BMI: 35.49215792320173
*/
public class Practice06 {
    public static void main(String[] args) {
        double height;
        double weightKg;
        double bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in meters: ");

        height = input.nextDouble();
        if (height <= 0) {
            System.out.println("Invalid height! It must be greater than 0.");
            return;
        }

        System.out.println("Please enter your weight in kilograms: ");

        weightKg = input.nextDouble();
        if (weightKg <= 0) {
            System.out.println("Invalid weight! It must be greater than 0.");
            return;
        }

        bodyMassIndex = weightKg / (height * height);
        System.out.println("Your BMI: " + bodyMassIndex);

    }
}
