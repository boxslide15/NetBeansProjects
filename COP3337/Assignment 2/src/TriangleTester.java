/**
 *
 * @author boxslide15
 */
import java.awt.geom.Point2D;
import java.util.Scanner;
public class TriangleTester {

    public static void main(String[] args) {

        Point2D.Double point1 = new Point2D.Double();
        Point2D.Double point2 = new Point2D.Double();
        Point2D.Double point3 = new Point2D.Double();
        char degree = 176;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the x and y coordinate for point 1, "
                + "seperating the values with a space: ");
        point1.x = in.nextInt();
        point1.y = in.nextInt();
        
        System.out.print("Please enter the x and y coordinate for point 2, "
                + "seperating the values with a space: ");
        point2.x = in.nextInt();
        point2.y = in.nextInt();
        
        System.out.print("Please enter the x and y coordinate for point 2, "
                + "seperating the values with a space: ");
        point3.x = in.nextInt();
        point3.y = in.nextInt();
                
        Triangle myTriangle = new Triangle(point1, point2, point3);
        
        System.out.printf("%33s %16s %16s\n----------------------------------------------------"
            + "----------------" 
            + "\nLength of sides: %10.4f units %10.4f units %10.4f units"
            + "\nAngles of sides: %9d" + degree + " %15d" + degree + " %15d" 
            + degree + "\nArea: %21.4f" + "\nPerimeter: %16.4f\n",
            "Side/Point 1", "Side/Point 2","Side/Point 3", 
            myTriangle.computeSide1(), myTriangle.computeSide2(), 
            myTriangle.computeSide3(), myTriangle.angleOfPoint1(), 
            myTriangle.angleOfPoint2(), myTriangle.angleOfPoint3(), 
            myTriangle.area(), myTriangle.perimeter());
        
    }
    
}
