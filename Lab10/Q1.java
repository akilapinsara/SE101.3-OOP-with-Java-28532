import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n1,n2,ans;
        System.out.println("Enter First Number: ");
        n1=a.nextInt();

        System.out.println("Enter Second Number: ");
        n2=a.nextInt();
        try{
            ans=n1/n2;
            System.out.println("Answer: "+ans);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}