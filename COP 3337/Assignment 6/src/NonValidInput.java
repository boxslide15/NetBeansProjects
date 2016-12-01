/**
 * @author Luis F Hernandez 5163353
 * @version 11/29/2016
 * Class: COP 3337-U09
 * Assignment #6
 *
 * An exception to handle Non Valid Input
 *
 * To compile and execute:
 *   javac FibTester.java
 *   java FibTester input.txt output.txt
 *
 * I hereby certify that this collective work is my own and none of it is
 * the work of any other person or entity.
 *
 */
public class NonValidInput extends Exception{
    
    public NonValidInput(String msg){
        
        super(msg);
        
    }
    
}
