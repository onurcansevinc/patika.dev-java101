import java.util.Scanner;

/*
Java Loops Practice

Write a Java program that prints the powers of 4 and 5 up to the entered number.
*/
public class Practice16 {
    public static void main(String[] args) {
        int limit;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        limit = input.nextInt();

        if (limit < 1) {
            System.out.println("Invalid number! It must be greater than 0.");
            return;
        }

        System.out.println("Powers of 4:");
        for (int i = 1; i <= limit; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5:");
        for (int i = 1; i <= limit; i *= 5) {
            System.out.println(i);
        }
    }
}
