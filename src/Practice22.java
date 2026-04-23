import java.util.Scanner;

/*
ATM Project

Write a Java program that allows the user to manage a bank account through an ATM.

Assignment
Implement the ATM operations by using switch-case.
*/
public class Practice22 {
    public static void main(String[] args) {
        String username;
        String password;
        int remainingAttempts = 3;
        int balance = 1500;
        int selection;

        Scanner input = new Scanner(System.in);

        while (remainingAttempts > 0) {
            System.out.print("Enter your username: ");
            username = input.nextLine();

            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Kodluyoruz Bank!");

                do {
                    System.out.println("1-Deposit Money");
                    System.out.println("2-Withdraw Money");
                    System.out.println("3-Check Balance");
                    System.out.println("4-Log Out");
                    System.out.print("Please select an operation: ");

                    selection = input.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.print("Enter the amount to deposit: ");
                            int depositAmount = input.nextInt();

                            if (depositAmount <= 0) {
                                System.out.println("Invalid amount! It must be greater than 0.");
                            } else {
                                balance += depositAmount;
                                System.out.println("Deposit successful. Current balance: " + balance);
                            }
                            break;

                        case 2:
                            System.out.print("Enter the amount to withdraw: ");
                            int withdrawAmount = input.nextInt();

                            if (withdrawAmount <= 0) {
                                System.out.println("Invalid amount! It must be greater than 0.");
                            } else if (withdrawAmount > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdrawAmount;
                                System.out.println("Withdrawal successful. Current balance: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;

                        case 4:
                            System.out.println("See you again.");
                            break;

                        default:
                            System.out.println("Invalid selection.");
                    }
                } while (selection != 4);

                break;
            } else {
                remainingAttempts--;
                System.out.println("Incorrect username or password. Please try again.");

                if (remainingAttempts == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + remainingAttempts);
                }
            }
        }
    }
}
