import java.util.Scanner;

/*
Assignment
If the password is incorrect, ask the user whether they want to reset it. If the user wants to reset the password, check that the new password is not the same as the old one. If the passwords are the same, print "Password could not be created, please enter a different password." Otherwise, print "Password created."
*/
public class Practice09 {
    public static void main(String[] args) {
        final String correctUsername = "username";
        final String correctPassword = "password";

        String username;
        String password;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect username or password.");
            System.out.println("Press \"1\" to reset your password.");
            System.out.println("Press \"2\" to exit.");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                while (true) {
                    System.out.print("Enter your new password: ");
                    password = input.nextLine();

                    if (password.equals(correctPassword)) {
                        System.out.println("Password could not be created, please enter a different password.");
                    } else {
                        System.out.println("Password created.");
                        break;
                    }
                }
            } else if (choice == 2) {
                System.out.println("Exited.");
            } else {
                System.out.println("Invalid selection.");
            }
        }
    }
}
