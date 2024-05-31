public class SavingsAccount extends Account{
    
    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
