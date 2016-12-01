/**
 * @author Luis F Hernandez 5163353
 * @version 11/29/2016
 * Class: COP 3337-U09
 * Assignment #6
 *
 * A class to recursively compute Fibonacci numbers
 *
 * To compile and execute:
 *   javac FibTester.java
 *   java FibTester input.txt output.txt
 *
 * I hereby certify that this collective work is my own and none of it is
 * the work of any other person or entity.
 *
 */
public class RecursiveFib {

    /**
     * The method to compute Fibonacci numbers recursively
     * @param number The number of Fibonacci numbers to compute
     * @return The Fibonacci number up to nth number.
     */
    public static long computeFib(int number){
        
        if (number <= 0){
            return 0;
        }
        else if (number == 1){
            return 1;
        }
        else {
            return computeFib(number - 1) + computeFib(number - 2);
        }
        
    }
    
}
