public abstract class Account {
    
    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        return balance;
    }
}
