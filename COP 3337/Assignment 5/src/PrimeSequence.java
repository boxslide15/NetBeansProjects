/**
 * @author Luis F Hernandez 5163353
 * @version 10/29/2016
 * Class: COP 3337-U09
 * Assignment #5
 *
 * A class to compute a sequence of prime numbers.
 * 
 * To compile and execute:
 *   javac Sequence.java PrimeSequence.java PrimeSequenceTester.java 
 *   java PrimeSequenceTester
 *
 * I hereby certify that this collective work is my own and none of it is
 * the work of any other person or entity.
 *
 */
public class PrimeSequence implements Sequence {
    
    private static int[] primes;
    
    /**
     * The constructor for the PrimeSequence class
     * @param numberOfPrimes the number of primes you want to compute
     */
    public PrimeSequence(int numberOfPrimes){
        primes = new int [numberOfPrimes];
    }
    
    /**
     * The constructor for the PrimeSequence class with no parameters
     */
    public PrimeSequence(){
        primes = new int [100];
    }
    
    /**
     * A method to compute the number of primes less than or equal to primes
     * @return the number of primes up to primes.
     */
    public boolean[] isPrime(){
        int n = 2;
        boolean[] values;
        do {
            
            values = new boolean[n + 1];
            for (int i = 2; i <= n; i++){
                values[i] = true;
            }
            
            for (int factor = 2; factor * factor <= n; factor++){
                if (values[factor]){
                    for (int j = factor; factor * j <= n; j++){
                        values[factor * j] = false;
                    }
                }
            }

            n++;
            
        } while(values.length != 524);
        return values;
    }
    
    /**
     * The next interface that returns the next number after two
     * @return the next number
     */
    public int next() {
        int n = 2;
        return n++;
    }
    
}
