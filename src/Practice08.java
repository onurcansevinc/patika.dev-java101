import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        int operation;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case 4:
                if (secondNumber == 0) {
                    System.out.println("A number cannot be divided by zero.");
                } else {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
    }
}
