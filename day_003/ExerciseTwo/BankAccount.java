package day3.ExerciseTwo;

public interface BankAccount {
    public void setAccountNumber(int accountNumber);
    public void setAccountHolder(String accountHolder);
    public void setBalance(double balance);
    public int getAccountNumber();
    public String getAccountHolder();
    public double getBalance();
    public void deposit(double amount);
    public void withdraw(double amount);
}
