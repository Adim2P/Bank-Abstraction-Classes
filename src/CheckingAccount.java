public class CheckingAccount extends Account{

    private final double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit, double interestRate) {
        super(balance, interestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
