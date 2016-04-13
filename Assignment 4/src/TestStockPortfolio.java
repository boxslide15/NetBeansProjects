/**
 *
 * @author Luis Hernandez U07
 */
import java.util.Scanner;
public class TestStockPortfolio {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String companyName;
        int numberOfShares;
        int dollarPortion;
        int eightsPortion;

        StockPortfolio myPortfolio = new StockPortfolio("NextGen Software", 100, 35, 3);

        System.out.println("Name of company: " + myPortfolio.getName() +
        "\nNumber of shares: " + myPortfolio.getNumberOfShares() +
        "\nDollar portion of shares: " + myPortfolio.getDollarPortion());
    }

}
