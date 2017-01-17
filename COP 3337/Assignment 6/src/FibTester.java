/**
 * @author Luis F Hernandez 5163353
 * @version 11/29/2016
 * Class: COP 3337-U09
 * Assignment #6
 *
 * A class that displays Fibonacci numbers using three separate methods to
 * compute them and outputs the results in an output file.
 *
 * To compile and execute:
 *   javac FibTester.java
 *   java FibTester input.txt output.txt
 *
 * I hereby certify that this collective work is my own and none of it is
 * the work of any other person or entity.
 *
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;             //Used for printing out messages
import java.util.logging.Logger;            //From my own exceptions
public class FibTester {

    public static void main(String[] args){

        try {
            
            String inputFileName =  args[0];
            String outputFileName = args[1];
            File inputFile = new File(inputFileName);
            Scanner input = new Scanner(inputFile);
            PrintWriter output = new PrintWriter(outputFileName);
            
            if (!input.hasNext()){
                throw new EmptyFileException("File is empty");
            }
            if (!input.hasNextInt()){
                throw new NonValidInput("Non valid input");
            }
            
            int userInput = input.nextInt();
            
            output.println("\t\tFast Recursive Fibonacci Sequence");
            
            for (int i = 0; i <= userInput; i++){
                output.print(" " + FastRecursiveFib.computeFastFib(i) + " |");
            }
            
            output.print("\n\t\tTime to execute in Miliseconds: " 
                    + System.currentTimeMillis());
            
            output.println("\n\n\t\tRecursive Fibonacci Sequence");
            
            for (int i = 0; i <= userInput; i++){
                output.print(" " + RecursiveFib.computeFib(i) + " |");
            }
            
            output.print("\n\t\tTime to execute in Miliseconds: " 
                    + System.currentTimeMillis());
            
            output.println("\n\n\t\tIterative Fibonacci Sequence");
            
            for (int i = 0; i <= userInput; i++){
                output.print(" " + LoopFib.loopFib(i) + " |");
            }
            
            output.print("\n\t\tTime to execute in Miliseconds: " 
                    + System.currentTimeMillis());
            
            input.close();
            output.close();
        }
        catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        } 
        catch (EmptyFileException ex) {
            ex.printStackTrace();
        }
        catch (NonValidInput ex) {
            ex.printStackTrace();
        }
  
    }
    
}
