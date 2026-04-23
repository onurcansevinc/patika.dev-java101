import java.util.Scanner;

/*
Armstrong Number Calculator

Write a Java program that checks whether the entered number is an Armstrong number.

Assignment
Write a program that calculates the sum of the digits of a number.
*/
public class Practice19 {
    public static void main(String[] args) {
        int number;
        int digitCount = 0;
        int tempNumber;
        int digitValue;
        int armstrongSum = 0;
        int digitSum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid number! It must be 0 or greater.");
            return;
        }

        tempNumber = number;

        if (tempNumber == 0) {
            digitCount = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                digitCount++;
            }
        }

        tempNumber = number;

        if (tempNumber == 0) {
            armstrongSum = 0;
            digitSum = 0;
        } else {
            while (tempNumber != 0) {
                int digitPower = 1;

                digitValue = tempNumber % 10;
                digitSum += digitValue;

                for (int i = 1; i <= digitCount; i++) {
                    digitPower *= digitValue;
                }

                armstrongSum += digitPower;
                tempNumber /= 10;
            }
        }

        if (armstrongSum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        System.out.println("Digit sum: " + digitSum);
    }
}
