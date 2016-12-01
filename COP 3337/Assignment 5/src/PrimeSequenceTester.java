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
public class PrimeSequenceTester {

    public static void main(String[] args) {
        
        PrimeSequence myPrime = new PrimeSequence();
        
        int counter = 0;
        
        for (int i = 0; i < myPrime.isPrime().length; i++){
            if (myPrime.isPrime()[i] == true){
                counter++;
                System.out.println(myPrime.isPrime()[i]);
            }
        }
        
        System.out.println(counter);
    }
       
}
