/**
 *
 * @author Luis Hernandez
 */
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class PolynomialTester {

    public static void main(String[] args) throws IOException{

        Polynomial myPoly = new Polynomial();

        File temp = new File("operations.txt");
        Scanner file = new Scanner(temp);

        while(file.hasNext()){
            String action = file.next();
            
            if (action.equals("INSERT")){
                int a = file.nextInt();
                int b = file.nextInt();
                
                myPoly.insert(a,b);
            }
            else if (action.equals("PRODUCT")){
                System.out.println("The product is: " + myPoly.product());
            }
            else if (action.equals("DELETE")){
                myPoly.delete(file.nextInt(), file.nextInt());
            }
            else if (action.equals("REVERSE")){
                myPoly.reverse();
            }
            System.out.println("The polynomial is: " + myPoly);

        }
    }

}
