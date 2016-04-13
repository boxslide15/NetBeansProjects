/**
 *
 * @author Luis Hernandez U07
 */
public class StockPortfolio {

    private String nameOfCompany;
    private int numberOfShares;
    private int dollarPortion;
    private int eigthsPortion;

    public StockPortfolio(String companyName, int numberOfShares, int dollarPortion, int eigthsPortion){
      this.nameOfCompany = companyName;
      this.numberOfShares = numberOfShares;
      this.dollarPortion = dollarPortion;
      this.eigthsPortion = eigthsPortion;
    }

    public String getName(){
      return nameOfCompany;
    }

    public int getNumberOfShares(){
      return numberOfShares;
    }

    public int getDollarPortion(){
      return dollarPortion;
    }

    public int getEightsPortion(){
      return eigthsPortion;
    }

    public void modifyStockPrice(int changeInDollars, int changeInEights){
      this.dollarPortion = changeInDollars;
      this.eigthsPortion = changeInEights;
    }

    public double computePortfolioValue(){
      double value = 0;
      return value;
    }
    
}
