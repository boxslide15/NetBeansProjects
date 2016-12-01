/**
 * @author Luis F Hernandez 5163353
 * @version 11/29/2016
 * Class: COP 3337-U09
 * Assignment #6
 *
 * A class to iteratively compute Fibonacci numbers.
 *
 * To compile and execute:
 *   javac FibTester.java
 *   java FibTester input.txt output.txt
 *
 * I hereby certify that this collective work is my own and none of it is
 * the work of any other person or entity.
 *
 */
public class LoopFib {
    
    /**
     * The method to compute Fibonacci numbers iteratively. The algorithm was
     * used from Pg. 607 of Big Java 6th Edition.
     * @param number
     * @return The Fibonacci number up to nth number.
     */
    public static long loopFib(int number){
        
        if (number <= 2){ 
          return 1;
        }
        else{
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            for (int i = 3; i <= number; i++){
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }       
            return newValue;    
        }
        
    }
    
 }