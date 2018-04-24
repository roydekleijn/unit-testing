package Bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //Withdraw money
    public void withdraw(double amount) {
        if(amount >= this.balance){
            throw new IllegalArgumentException("amount is too high");
        }
        this.balance -= amount;
    }

    //Deposit money
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Get balance
    public double getBalance() {
        return this.balance;
    }


}
