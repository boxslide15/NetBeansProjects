/**
 *
 * @author boxslide15
 */
import java.util.Scanner;
public class MortgageTester {

    public static void main(String[] args) {
        double amount, rate;
        int term;
        String str;
        Scanner in = new Scanner(System.in);
        Mortgage mortgage1 = new Mortgage();
        
        System.out.printf("Payment of mortgage 1: %.2f\n", mortgage1.computePayment());
        
        do{
            System.out.print("Please enter the principal ammount: ");
            amount = in.nextDouble();
        
            System.out.print("\nPlease enter the rate: ");
            rate = in.nextDouble();
        
            System.out.print("\nPlease enter the term: ");
            term = in.nextInt();
        
            Mortgage myMortgage = new Mortgage(amount, rate, term);
        
            System.out.printf("Payment of mortgage 2: %.2f\n", myMortgage.computePayment());
            System.out.println("Do you want to continue?: ");
            str = in.next();
        }
        while(str.equalsIgnoreCase("y"));
    }   
}