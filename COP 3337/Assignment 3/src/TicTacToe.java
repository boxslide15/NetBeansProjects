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
public class TicTacToe {

    private char[][] board = new char[3][3];
    private char player;
    
    /**
     * The constructor for the TicTacToe class using the board array. The 
     * Constructor initializes a Tic-Tac-Toe board with values of ' '
     */
    public TicTacToe(){
        board = new char[3][3];
        player = 'x';
        for (int i = 0; i < board[i].length; i++){
            for (int j = 0; j < board[j].length; j++){
                board[i][j] = ' ';
            }
        }
    }
    
    /**
     * A method to print the board with current marks. If the board is empty it
     * prints an empty board set. If the board contains marks then the board 
     * prints with marks in their appropriate row and column.
     * The board should look like this: 
     *  1 2 3
     *  _|_|_ 1
     *  _|_|_ 2
     *  _|_|_ 3
     */
    public void printBoard(){
        int mark = 1;
        System.out.println("\n1 2 3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    System.out.print("_");
                } 
                else {
                    System.out.print(board[i][j]);
                }
                
                if (j < 2) {
                    System.out.print("|");
                } 
                else {
                    System.out.println(" " + mark);
                    mark++;
                } 
             }
         }
         System.out.println();
    }
    
    /**
     * A method that checks if the board array contains marks
     * @return true if the board is full
     */
    public boolean isBoardFull(){
        boolean isFull = true;
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == ' '){
                    isFull = false;
                }
            }
        }
        
        return isFull;
    }
    
    /**
     * A method that returns the current player mark
     * @return the current player mark
     */
    public char getPlayer(){
        return player;
    }
    
    /**
     * A method that checks to see if there is a match between three marks of 
     * either player
     * @param mark1 the first mark
     * @param mark2 the second mark
     * @param mark3 the third mark
     * @return true if the three marks match and they're of the first or second
     * player
     */
    private boolean checkMatch(char mark1, char mark2, char mark3){
        return ((mark1 != ' ') && (mark1 == mark2) && (mark2 == mark3));
    }
    
    /**
     * A method that computes to see if there's a match between three marks
     * from the same row from either player
     * @return true if there is a match of marks in the same row
     */
    private boolean checkRowMatch(){
        for (int i = 0; i < 3; i++){
            if (checkMatch(board[i][0], board[i][1], board[i][2]) == true){
            return true;
            }
        }
        return false;
    }
    
    /**
     * A method that computes to see if there's a match between three marks
     * from the same column from either player
     * @return true if there is a match of marks in the same column
     */
    private boolean checkColumnMatch(){
        for (int i = 0; i < 3; i++){
            if (checkMatch(board[0][i], board[1][i], board[2][i]) == true){
                return true;
            }
        }
        return false;
    }
    
    /**
     * A method that computes to see if there's a match between three marks
     * from the two possible diagonals from either player
     * @return true if there's a match of marks in either diagonal
     */
    private boolean checkDiagonalMatch(){
        return ((checkMatch(board[0][0], board[1][1], board[2][2]) == true) 
                || (checkMatch(board[0][2], board[1][1], board[2][0]) == true));
    }
    
    /**
     * A method that determines if there is a winner by matching three marks
     * @return true if a player wins
     */
    public boolean checkWin(){
        return (checkRowMatch() || checkColumnMatch() || checkDiagonalMatch());
    }
    
    /**
     * A method that places a mark on the cell specified by the row and column.
     * Also checks if the user input's are in bounds of the array and empty
     * @param row the row of the mark to be inserted
     * @param column the column of the mark to be inserted 
     * @return true if the row and column are within the bounds of the array and
     * it's empty
     */
    public boolean placeMark(int row, int column){
        if ((row > 0) && (column <= 3)){
            if((column > 0) && (column <= 3)){
                if (board[row - 1][column - 1] == ' '){
                    board[row - 1][column - 1] = player;
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * A method that changes the current player's mark.
     */
    public void changePlayer(){
        if (player == 'x'){
            player = 'o';
        }
        else {
            player = 'x';
        }
    }
}
