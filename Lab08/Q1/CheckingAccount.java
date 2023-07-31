public class CheckingAccount extends BankAccount{
    private final double interest=0.02;

   
    public double calculateInterest() {
        return getBalance()*interest;
    }
}
