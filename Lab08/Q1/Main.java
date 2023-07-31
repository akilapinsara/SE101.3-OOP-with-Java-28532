
public class Main {
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount();
        s1.setBalance(20_000_000.00);
        double SAVING_INTEREST= s1.calculateInterest();
        System.out.println("SAVING_INTEREST:- "+SAVING_INTEREST);

        CheckingAccount c1=new CheckingAccount();
        c1.setBalance(100_000.00);
        double CHACKING_INTEREST =c1.calculateInterest();
        System.out.println("CHACKING_INTEREST:- "+CHACKING_INTEREST);
    }
}