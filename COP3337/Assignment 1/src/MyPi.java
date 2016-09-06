/**
 * A class to compute an approximation of pi up to six significant figures
 * @author Luis F Hernandez 5163353
 * @version 08/30/2016
 * 
 * Disclaimer: I hereby certify that this collective work is my own and none 
 * of it is the work of any other person or entity. 
 * 
 */

public class MyPi {

    public static void main(String[] args) {
        
        int iterations = 0;
        double fraction = 3;
        double deltaA = 0;
        double deltaB = 0;
        final double EPSILON = 1E-7;
        
        /**
         * The accuracy of the computation of pi increases as the do loop 
         * iterates by following the formula as demonstrated in the Big Java 
         * textbook: pi/4 = 1 - 1/3 + 1/5 - 1/7 ... etc
         * 
         * The process starts with an initial value for pi/4, then the do loop
         * executes by incrementing the fraction by a factor of two. 
         */
        
        double piOverFour = 1 - (1 / fraction);
        
        do 
        {
           fraction += 2;
           piOverFour += (1 / fraction);
           deltaA = piOverFour;
           fraction += 2;
           piOverFour -= (1 / fraction);
           deltaB = piOverFour;
           iterations++;
        }
        while(!(Math.abs(deltaA - deltaB) <= EPSILON));
        /**
         * The while condition compares an instance when the value of piOverFour
         * starts with the string PI_OVER_FOUR_TRUNC, which has the requisite 
         * six significant figures for the calculation.
         */
        
        System.out.println("Computed pi: " + (piOverFour * 4) //Multiply by 
                + " \nMath.PI library: "                      //4 to get pi 
                + Math.PI + " \nIterations: " + iterations); 
    }
       
}