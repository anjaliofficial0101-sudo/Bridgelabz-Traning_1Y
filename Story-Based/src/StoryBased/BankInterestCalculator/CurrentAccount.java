package StoryBased.BankInterestCalculator;
public class CurrentAccount {
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public double calculateInterest() {
        return balance * 0.2;
    }
}