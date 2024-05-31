import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        SavingsAccount sAccount = null;
        CheckingAccount cAccount = null;

        System.out.println("Welcome to the Sinto Bank!");
        System.out.println("Choose an account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        int choice = userInput.nextInt();

        switch (choice) {
            case 1:
                sAccount = new SavingsAccount(1000.0, 1.0);
                break;
            case 2:
                cAccount = new CheckingAccount(500.0, 200.0, 1.0);
                break;
            default:
                System.out.println("Invalid choice. Exiting program...");
                return;
        }

        try {
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. View Balance");
                System.out.println("4. Exit");
                int option = userInput.nextInt();
    
                switch (option) {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        double amount = userInput.nextDouble();
                        if (sAccount != null) {
                            try {
                                sAccount.deposit(amount);
                                System.out.println("Deposit successful. New balance: " + sAccount.getBalance());
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else if (cAccount != null) {
                            try {
                                cAccount.deposit(amount);
                                System.out.println("Deposit successful. New balance: " + cAccount.getBalance());
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        amount = userInput.nextDouble();
                        if (sAccount != null) {
                            try {
                                sAccount.withdraw(amount);
                                System.out.println("Withdrawal successful. New balance: " + sAccount.getBalance());
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else if (cAccount != null) {
                            try {
                                cAccount.withdraw(amount);
                                System.out.println("Withdrawal successful. New balance: " + cAccount.getBalance());
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                        break;
                    case 3:
                        if (sAccount != null) {
                            System.out.println("Balance: " + sAccount.getBalance());
                        } else if (cAccount != null) {
                            System.out.println("Balance: " + cAccount.getBalance());
                        }
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } finally {
            userInput.close();
        }
    }
}