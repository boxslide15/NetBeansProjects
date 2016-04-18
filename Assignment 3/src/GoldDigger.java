/**
 *
 * @author Luis Hernandez
 */
public class GoldDigger {
    
    private String nameOfCoin;
    private double priceOfGold;
    private double sellingPriceOfCoin;
    private double shipAndHandling;
    private double salesTax;
    private double amountOfGold;
    
    public GoldDigger(String theName, double price, double sellingPrice, double shipAndHandling, double salesTax, double amount){
        nameOfCoin = theName;
        priceOfGold = price;
        sellingPriceOfCoin = sellingPrice;
        this.shipAndHandling = shipAndHandling;
        this.salesTax = salesTax;
        amountOfGold = amount;
    }
    
    public String getName(){
        return nameOfCoin;
    }
    
    public double getPriceOfGold(){
        return priceOfGold;
    }
    
    public double getSellingPriceOfCoin(){
        return sellingPriceOfCoin;
    }
    
    public double getShipAndHandling(){
        return shipAndHandling;
    }
    
    public double getSalesTax(){
        return salesTax;
    }
    
    public double getAmountOfGold(){
        return amountOfGold;
    }
    
    public void setPriceOfGold(double newPrice){
        priceOfGold = newPrice;
    }
    
    public int computeNumberOfCoins(){
        int numberOfCoins;
        double gramsPerOunce = 28.35;
        numberOfCoins = (int)((gramsPerOunce * 1000) / amountOfGold);
        return numberOfCoins;
    }
    
    public double computePremium(){
        double premium;
        premium = (((this.computeNumberOfCoins() * sellingPriceOfCoin) + (this.computeNumberOfCoins() * shipAndHandling)) * (1 + (salesTax / 100))) - (priceOfGold);
        return premium;
    }
}