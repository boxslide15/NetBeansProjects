/**
 *
 * @author boxslide15
 */
public class Mortgage {
    
    private double principal;
    private double rate;
    private int year;
    
    public Mortgage(){
        principal = 200000.00;
        rate = 5.0;
        year = 30;
    }
    
    public Mortgage(double principal, double rate, int year){
        this.principal = principal;
        this.rate = rate;
        this.year = year;
    }
    
    public double getPrincipal(){
        return principal;
    }
    
    public double getRate(){
        return rate;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setPrincipal(double principal){
        this.principal = principal;
    }
    
    public void setRate(double rate){
        this.rate = rate;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public double computePayment(){
        double payment;
        double interest = rate / (12 * 100);
        int months = year * 12;
        payment = (principal * interest) / (1 - Math.pow((1 + interest), -months));
        return payment;
    }
}
