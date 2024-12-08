package DecoratorPattern;

public interface BankAccount {
    String showAccount();
    double getInterestRate();
    double getBalance();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}