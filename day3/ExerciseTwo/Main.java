package day3.ExerciseTwo;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new Account();
        savingsAccount.setAccountNumber(2000354248);
        savingsAccount.setAccountHolder("Rafael Louise Cortes");
        savingsAccount.setBalance(0);

        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Account Holder: " + savingsAccount.getAccountHolder());
        System.out.println("Balance: PHP" + savingsAccount.getBalance());

        savingsAccount.deposit(1000000);
        System.out.println();

        System.out.println("Money has been deposited!");
        System.out.println("Balance: PHP" + savingsAccount.getBalance());

        savingsAccount.withdraw(250000);
        System.out.println();
        
        System.out.println("Money has been withdrawn!");
        System.out.println("Balance: PHP" + savingsAccount.getBalance());
    }
}
