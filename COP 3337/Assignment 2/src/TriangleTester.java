/**
 * @author Luis F Hernandez 5163353
 * @version 09/14/2016
 * Class: COP 3337-U09
 * Assignment #2
 * 
 * A tester class that creates a Triangle object from it's respective class
 * To compile and execute: 
 *   javac Triangle.java TriangleTester.java
 *   java TriangleTester
 * 
 * I hereby certify that this collective work is my own and none of it is 
 * the work of any other person or entity. 
 * 
 */
import java.awt.geom.Point2D;   //Tester class uses Point2D to construct triangle
import java.util.Scanner;       //The input will be recorded using the scanner 
public class TriangleTester {   //class
    
    public static void main(String[] args) {

        Point2D.Double point1 = new Point2D.Double();
        Point2D.Double point2 = new Point2D.Double();
        Point2D.Double point3 = new Point2D.Double();
        final char DEGREE = 176;    //The degree symbol used in the angle output
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the x and y coordinate for point 1, "
                + "seperating the values with a space: ");
        point1.x = in.nextDouble();
        point1.y = in.nextDouble();
        
        System.out.print("Please enter the x and y coordinate for point 2, "
                + "seperating the values with a space: ");
        point2.x = in.nextDouble();
        point2.y = in.nextDouble();
        
        System.out.print("Please enter the x and y coordinate for point 3, "
                + "seperating the values with a space: ");
        point3.x = in.nextDouble();
        point3.y = in.nextDouble();
                
        Triangle myTriangle = new Triangle(point1, point2, point3);

        System.out.printf("\n%32s %16s %16s\n------------------------------"
            + "--------------------------------------" 
            + "\nLength of side: %10.4f units %10.4f units %10.4f units"
            + "\nAngles of point: %8d" + DEGREE + " %15d" + DEGREE + " %15d" 
            + DEGREE + "\nArea: %20.4f units" + "\nPerimeter: %15.4f units\n",
            "Side/Point 1", "Side/Point 2","Side/Point 3", 
            myTriangle.computeSide1(), myTriangle.computeSide2(), 
            myTriangle.computeSide3(), myTriangle.angleOfPoint1(), 
            myTriangle.angleOfPoint2(), myTriangle.angleOfPoint3(), 
            myTriangle.area(), myTriangle.perimeter());
              
    }
    
}
