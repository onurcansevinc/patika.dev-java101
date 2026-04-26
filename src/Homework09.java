import java.util.Scanner;

/*
Advanced Calculator

Write a Java program that performs multiple calculator operations based on the user's selection.
*/
public class Homework09 {
    static final Scanner INPUT = new Scanner(System.in);

    static void plus() {
        int number;
        int result = 0;
        int index = 1;

        while (true) {
            System.out.print(index++ + ". number (0 to finish): ");
            number = INPUT.nextInt();

            if (number == 0) {
                break;
            }

            result += number;
        }

        System.out.println("Result: " + result);
    }

    static void minus() {
        System.out.print("How many numbers will you enter: ");
        int count = INPUT.nextInt();

        if (count <= 0) {
            System.out.println("Invalid count! It must be greater than 0.");
            return;
        }

        int result = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". number: ");
            int number = INPUT.nextInt();

            if (i == 1) {
                result = number;
            } else {
                result -= number;
            }
        }

        System.out.println("Result: " + result);
    }

    static void times() {
        int number;
        int result = 1;
        int index = 1;

        while (true) {
            System.out.print(index++ + ". number (1 to finish): ");
            number = INPUT.nextInt();

            if (number == 1) {
                break;
            }

            if (number == 0) {
                result = 0;
                break;
            }

            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divide() {
        System.out.print("How many numbers will you enter: ");
        int count = INPUT.nextInt();

        if (count <= 0) {
            System.out.println("Invalid count! It must be greater than 0.");
            return;
        }

        double result = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". number: ");
            double number = INPUT.nextDouble();

            if (i == 1) {
                result = number;
            } else {
                if (number == 0) {
                    System.out.println("You cannot divide by 0.");
                    return;
                }
                result /= number;
            }
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        System.out.print("Enter the base value: ");
        int base = INPUT.nextInt();

        System.out.print("Enter the exponent value: ");
        int exponent = INPUT.nextInt();

        if (exponent < 0) {
            System.out.println("Invalid exponent! It must be 0 or greater.");
            return;
        }

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        System.out.print("Enter a number: ");
        int number = INPUT.nextInt();

        if (number < 0) {
            System.out.println("Invalid number! It must be 0 or greater.");
            return;
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void mod() {
        System.out.print("Enter the first number: ");
        int firstNumber = INPUT.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = INPUT.nextInt();

        if (secondNumber == 0) {
            System.out.println("You cannot take modulo by 0.");
            return;
        }

        System.out.println("Result: " + (firstNumber % secondNumber));
    }

    static void rectangle() {
        System.out.print("Enter the width: ");
        int width = INPUT.nextInt();

        System.out.print("Enter the height: ");
        int height = INPUT.nextInt();

        if (width <= 0 || height <= 0) {
            System.out.println("Invalid dimensions! Both values must be greater than 0.");
            return;
        }

        int area = width * height;
        int perimeter = 2 * (width + height);

        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        int selection;

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Modulo Operation\n"
                + "8- Rectangle Area and Perimeter\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            selection = INPUT.nextInt();

            switch (selection) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Exited.");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        } while (selection != 0);
    }
}
