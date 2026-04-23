import java.util.Scanner;

/*
Diamond Pattern with Stars

Write a Java program that prints a diamond shape using loops and stars.
*/
public class Practice21 {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number < 1) {
            System.out.println("Invalid number! It must be greater than 0.");
            return;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = number - 2; i >= 0; i--) {
            for (int j = 0; j < (number - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
