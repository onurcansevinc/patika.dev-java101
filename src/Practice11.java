import java.util.Scanner;

/*
Conditions:

If the temperature is below 5, suggest "Skiing".
If the temperature is between 5 and 15, suggest "Going to the cinema".
If the temperature is between 15 and 25, suggest "Having a picnic".
If the temperature is above 25, suggest "Swimming".

Assignment
Find alternative ways to build the same logic using different if-condition structures.
*/
public class Practice11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        if (temperature < 5) {
            System.out.println("You can go skiing.");
        } else if (temperature <= 15) {
            System.out.println("You can go to the cinema.");
        } else if (temperature <= 25) {
            System.out.println("You can have a picnic.");
        } else {
            System.out.println("You can go swimming.");
        }
    }
}
