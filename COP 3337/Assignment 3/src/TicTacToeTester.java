/**
 * @author Luis F Hernandez 5163353
 * @version 09/28/2016
 * Class: COP 3337-U09
 * Assignment #3
 * 
 * A class to create a Tic-Tac-Toe game including the board and it's appropriate
 * functions
 * 
 * To compile and execute: 
 *   javac TicTacToe.java TicTacToeTester.java
 *   java TicTacToeTester
 * 
 * I hereby certify that this collective work is my own and none of it is 
 * the work of any other person or entity. 
 * 
 */
import java.util.Scanner; // Scanner used for user input
public class TicTacToeTester {

    public static void main(String[] args) {

        boolean draw = false; //Used to exit while loop if results in draw
        Scanner in = new Scanner(System.in);
        TicTacToe myTicTacToe = new TicTacToe();
        System.out.println("Let's Play Tic-Tac-Toe! Player 1 moves first");
        
        do {
            if (!myTicTacToe.checkWin() && !myTicTacToe.isBoardFull()){
                System.out.print("Player 1 Please enter the row and column you "
                        + "would like to mark, seperated by a space: ");
                if (myTicTacToe.placeMark(in.nextInt(), in.nextInt()) == true){
                        myTicTacToe.printBoard();
                        myTicTacToe.changePlayer();
                } 
                else {
                    boolean validMark = false;
                    while (validMark == false){
                        System.out.print("Invalid row and/or column. "
                                + "Please enter a valid row and column: ");
                        if (myTicTacToe.placeMark(in.nextInt(), in.nextInt()) 
                                == true){
                            myTicTacToe.printBoard();
                            myTicTacToe.changePlayer();
                            validMark = true;
                        } 
                    }
                }

                if (!myTicTacToe.checkWin() && !myTicTacToe.isBoardFull()){
                    System.out.print("Player 2 Please enter the row and column "
                            + "you would like to mark, seperated by a space: ");
                    if (myTicTacToe.placeMark(in.nextInt(), in.nextInt()) 
                                == true){
                            myTicTacToe.printBoard();
                            myTicTacToe.changePlayer();
                    } 
                    else {
                        boolean validMark = false;
                        while (validMark == false){
                            System.out.print("Invalid row and/or column. "
                                    + "Please enter a valid row and column: ");
                            if (myTicTacToe.placeMark(in.nextInt(),in.nextInt()) 
                                    == true){
                                myTicTacToe.printBoard();
                                myTicTacToe.changePlayer();
                                validMark = true;
                            } 
                        }
                    }
                }
            } 
            else {
                    System.out.println("It's a draw!");
                    draw = true;
            }
            
            /**
             * The checkWin() method is called after the changePlayer() method 
             * is executed, so if getPlayer() == 'x', then the player with 'o'
             * marks wins and vice versa.
             */
            if (myTicTacToe.checkWin() && myTicTacToe.getPlayer() == 'x'){
                System.out.println("Player 2 wins!"); 
            }
            else if (myTicTacToe.checkWin() && myTicTacToe.getPlayer() == 'o'){
                    System.out.println("Player 1 wins!");
            }

        } while(!myTicTacToe.checkWin() && draw == false);
        
    }

}
