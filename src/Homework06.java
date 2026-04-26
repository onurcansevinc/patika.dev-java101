import java.util.Scanner;

/*
Inverted Triangle with Stars

Write a Java program that takes the height from the user and prints an inverted triangle using stars.
*/
public class Homework06 {
    public static void main(String[] args) {
        int height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height: ");
        height = input.nextInt();

        if (height <= 0) {
            System.out.println("Invalid height! It must be greater than 0.");
            return;
        }

        for (int i = 0; i < height; i++) {
            int starCount = (2 * height - 1) - (2 * i);

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
