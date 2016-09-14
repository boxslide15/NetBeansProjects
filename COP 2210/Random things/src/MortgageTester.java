/**
 *
 * @author boxslide15
 */
public class MortgageTester {

    public static void main(String[] args) {
        
        Mortgage mortgage[] = new Mortgage[3]; 
        
        mortgage[0] = new Mortgage(200000, 5, 30);
        mortgage[1] = new Mortgage(200000, 4, 15);
        mortgage[2] = new Mortgage(500000, 2, 30);
        
        //for (int i = 0; i < mortgage.length; i++){
        //    mortgage[i] = new Mortgage();
        //}
        
        //mortgage[0].setPrincipal(200000);
        //mortgage[0].setRate(5);
        //mortgage[0].setYear(30);
        
        //mortgage[1].setPrincipal(200000);
        //mortgage[1].setRate(4);
        //mortgage[1].setYear(15);
        
        //mortgage[2].setPrincipal(500000);
        //mortgage[2].setRate(2);
        //mortgage[2].setYear(30);
        
        for (int i = 0; i < mortgage.length; i++){
            System.out.printf("The payment is: %.2f\n", mortgage[i].computePayment());
        }
    }   
}