abstract public class BankAccount {
    private int accountNumber;
    private double balance;


    public int getAccountNumber() {
        return accountNumber;
    }
   
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
  
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();

}
