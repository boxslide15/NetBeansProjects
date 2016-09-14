/**
 *
 * @author Luis Hernandez
 */
import java.util.Scanner;
import java.util.Random;
public class NumbersGameTester {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        String betType;
        int counter = 0;
        int betAmount;
        int playerNumber;
        //Randomly generate the winning number from 1-999
        int winningNumber = r.nextInt(899) + 1;
        //int winningNumber;
        System.out.print("Please enter bet type: ");
        betType = in.next();
        System.out.print("\nPlease enter bet amount: $");
        betAmount = in.nextInt();
        System.out.print("\nPlease enter three numbers: ");
        playerNumber = in.nextInt();
        //System.out.print("\nPlease enter winning numbers: ");
        //winningNumber = in.nextInt();

        NumbersGame myGame = new NumbersGame(betType, betAmount, playerNumber, winningNumber);

        System.out.println("\nThe bet type: " + myGame.getBetType() +
                "\nThe bet amount: $" + myGame.getBetAmount() +
                "\nYour numbers: " + myGame.getPlayersNumber() +
                "\nThe winning numbers: " + myGame.getWinningNumber());

        while (myGame.computeWinnings().equals("You lose!")){
          counter++;
          //Thread.sleep(500);
          winningNumber = r.nextInt(899) + 101;
          myGame.setWinningNumber(winningNumber);
          System.out.println("\nGame #" + counter + "\n====================") ;
          System.out.println("Your number: " + myGame.getPlayersNumber() + "\nWinning number: " + myGame.getWinningNumber()  + "\n" + myGame.computeWinnings());
        }
        System.out.println("You would win with your player number " + myGame.getPlayersNumber() + " in " + counter + " tries.");
    }
}
