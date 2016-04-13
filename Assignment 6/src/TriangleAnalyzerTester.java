/**
 *
 * @author Luis Hernandez
 */
import java.util.Scanner;
public class TriangleAnalyzerTester {

    public static void main(String[] args) {
        
        int triangleSide1;
        int triangleSide2;
        int triangleSide3;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter length of first side: ");
        triangleSide1 = in.nextInt();
        System.out.print("\nPlease enter length of second side: ");
        triangleSide2 = in.nextInt();
        System.out.print("\nPlease enter length of third side: ");
        triangleSide3 = in.nextInt();
        
        TriangleAnalyzer myTriangle = new TriangleAnalyzer(triangleSide1, triangleSide2, triangleSide3);
        
        System.out.println("\n" + myTriangle.getTriangleSides() + 
                "\nTriangle type: " + myTriangle.typeOfTriangle());
        
        if (!myTriangle.typeOfTriangle().equals("The side lengths don't form a triangle")){
            System.out.printf("The area of the triangle is: %.2f\n" , myTriangle.areaOfTriangle());
        }
    }   
}