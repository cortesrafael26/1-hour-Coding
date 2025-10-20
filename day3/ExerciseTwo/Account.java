package day3.ExerciseTwo;

public class Account implements BankAccount {
    /* Write a Java program to create a class called Account with private instance variables accountNumber, 
    accountHolder, and balance. Provide public getter and setter methods to access and modify these 
    variables. Add a method called deposit() that takes an amount and increases the balance by that amount, 
    and a method called withdraw() that takes an amount and decreases the balance by that amount. */

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
