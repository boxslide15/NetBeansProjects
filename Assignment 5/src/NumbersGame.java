/**
 *
 * @author Luis Hernandez
 */
public class NumbersGame {

    private String betType;
    private int betAmount;
    private int playersNumber;
    private int winningNumber;
    private int playerNumber1; // first number of players number
    private int playerNumber2; // second number of players number
    private int playerNumber3; // third number of players number
    private int winningNumber1; // first number of winning number
    private int winningNumber2; // second number of winning number
    private int winningNumber3; // third number of winning number

    public NumbersGame(String type, int amount, int playersNumber, int winningNumber){
      String playerNumber = Integer.toString(playersNumber);
      String winningsNumber = Integer.toString(winningNumber);

      this.betType = type;
      this.betAmount = amount;
      this.playersNumber = playersNumber;
      this.winningNumber = winningNumber;

      playerNumber1 = Integer.parseInt(playerNumber.substring(0,1));
      playerNumber2 = Integer.parseInt(playerNumber.substring(1,2));
      playerNumber3 = Integer.parseInt(playerNumber.substring(2));

      winningNumber1 = Integer.parseInt(winningsNumber.substring(0,1));
      winningNumber2 = Integer.parseInt(winningsNumber.substring(1,2));
      winningNumber3 = Integer.parseInt(winningsNumber.substring(2));
    }

    public String getNumber1(){
      return Integer.toString(playerNumber1);
    }

    public String getNumber2(){
      return Integer.toString(playerNumber2);
    }

    public String getNumber3(){
      return Integer.toString(playerNumber3);
    }

    public String getWinningNumber1(){
      return Integer.toString(winningNumber1);
    }

    public String getWinningNumber2(){
      return Integer.toString(winningNumber2);
    }

    public String getWinningNumber3(){
      return Integer.toString(winningNumber3);
    }

    public String getBetType(){
      return betType;
    }

    public String getBetAmount(){
      return Integer.toString(betAmount);
    }

    public String getPlayersNumber(){
      return Integer.toString(playersNumber);
    }

    public String getWinningNumber(){
      return Integer.toString(winningNumber);
    }

    public void setWinningNumber(int newNumber){
        winningNumber = newNumber;
    }

    public void setPlayersNumber(int newNumber){
        playersNumber = newNumber;
    }

    public boolean allThreeMatch(){
        return playersNumber == winningNumber;
    }

    public boolean matchAnyOrder(){
        return (playersNumber == winningNumber) || (playerNumber1 == winningNumber1 && playerNumber3 == winningNumber2 && playerNumber2 == winningNumber3) ||
                (playerNumber3 == winningNumber1 && playerNumber1 == winningNumber2 && playerNumber2 == winningNumber3) ||
                (playerNumber3 == winningNumber1 && playerNumber2 == winningNumber2 && playerNumber1 == winningNumber3) ||
                (playerNumber2 == winningNumber1 && playerNumber1 == winningNumber2 && playerNumber3 == winningNumber3) ||
                (playerNumber2 == winningNumber1 && playerNumber3 == winningNumber2 && playerNumber1 == winningNumber3);
    }

    public String computeWinnings(){
      String winnings;
      if ("Straight".equals(betType)){
        if (allThreeMatch()){
          winnings = "You win $" + betAmount * 600 + "!";
        }
        else {
          winnings = "You lose!";
        }
      }
      else{
       if (matchAnyOrder()){
           if (playerNumber1 == playerNumber2 || playerNumber1 == playerNumber3 || playerNumber2 == playerNumber3){
               winnings = "You win $" + betAmount * 200 + "!";
           }
           else{
             winnings = "You win $" + betAmount * 100 + "!";
           }
       }
       else{
         winnings = "You lose!";
       }
      }
      return winnings;
    }
}