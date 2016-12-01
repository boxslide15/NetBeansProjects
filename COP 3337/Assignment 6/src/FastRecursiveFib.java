/**
 * @author Luis F Hernandez 5163353
 * @version 11/29/2016
 * Class: COP 3337-U09
 * Assignment #6
 *
 * A class to recursively compute Fibonacci numbers using a memoization method
 * which decreases the runtime of the program.
 *
 * To compile and execute:
 *   javac FibTester.java
 *   java FibTester input.txt output.txt
 *
 * I hereby certify that this collective work is my own and none of it is
 * the work of any other person or entity.
 *
 */
public class FastRecursiveFib{

    /**
     * An array of size 51 is used since the most Fibonacci numbers to be
     * computed are less than 50
     */
    public static long[] resultHistory = new long[51];
    
    /**
     * The method to compute Fibonacci numbers recursively. This method uses
     * previously calculated Fib numbers in it's recursive defenition to speed
     * up runtime.
     * @param number The number of Fibonacci numbers to compute.
     * @return The Fibonacci number up to nth number.
     */
    public static long computeFastFib(int number){

        long result = 0;

        if (number == 0){
            return 0;
        }
        
        else if (number == 1){
            return 1;
        }
        
        else if (resultHistory[(int) number] != 0){
            return resultHistory[(int) number];
        }
        else{
            result = computeFastFib(number - 1) + computeFastFib(number - 2);
            resultHistory[(int) number] = result;
            return result;
        }

    }

}