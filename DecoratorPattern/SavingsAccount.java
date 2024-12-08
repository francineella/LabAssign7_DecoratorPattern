package DecoratorPattern;

public class SavingsAccount implements BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccount() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 1.0; // 1% interest rate
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate() / 100);
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Name: " + accountName + "\n" +
               "Balance: " + balance;
    }
}