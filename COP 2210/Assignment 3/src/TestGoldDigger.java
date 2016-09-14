/**
 *
 * @author Luis Hernandez
 */
public class TestGoldDigger {

    public static void main(String[] args) {
        
        String nameOfCoin = "$50 Gold Buffalo";
        double priceOfGold = 1242.30;
        double sellingPriceOfCoin = 9.95;
        double shipAndHandling = 4.95;
        double salesTax = 7.5;
        double amountOfGold = 14.0;

        GoldDigger myGoldDigger = new GoldDigger(nameOfCoin, priceOfGold, sellingPriceOfCoin, shipAndHandling, salesTax, amountOfGold);
        
        // Initial output
        System.out.println("Name of the coin: " + myGoldDigger.getName() + 
                "\nPrice of gold, per ounce: " + myGoldDigger.getPriceOfGold() + 
                "\nSelling price of the coin: " + myGoldDigger.getSellingPriceOfCoin() + 
                "\nShipping and handling charges: " + myGoldDigger.getShipAndHandling() + 
                "\nSales tax rate: " + myGoldDigger.getSalesTax() + "%" + 
                "\nAmount of gold in the coin, in mg: " + myGoldDigger.getAmountOfGold());
        
        // Number of coins
        System.out.println("=======================================\nNumber of coins: " + myGoldDigger.computeNumberOfCoins());
        
        // Premium
        System.out.println("=======================================\nPremium: $" + myGoldDigger.computePremium());
        
        // Modify the price of an ounce of gold
        myGoldDigger.setPriceOfGold(1655.50);
        
        // Print updated price of gold
        System.out.println("=======================================\nUpdated price of gold: " + myGoldDigger.getPriceOfGold());
        
        // Print new premium
        System.out.println("=======================================\nNew premium: $" + myGoldDigger.computePremium());
    }
}
