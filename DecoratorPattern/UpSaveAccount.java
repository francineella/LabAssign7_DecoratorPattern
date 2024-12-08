package DecoratorPattern;

public class UpSaveAccount implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSaveAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccount() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 2.5;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits();
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = bankAccount.getBalance();
        return balance + (balance * getInterestRate() / 100);
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}