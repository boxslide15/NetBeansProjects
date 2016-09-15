/**
 * @author Luis F Hernandez 5163353
 * @version 09/14/2016
 * Class: COP 3337-U09
 * Assignment #2
 * 
 * A class to compute the properties of a triangle using Point2D objects
 * To compile and execute: 
 *   javac Triangle.java TriangleTester.java
 *   java TriangleTester
 * 
 * I hereby certify that this collective work is my own and none of it is 
 * the work of any other person or entity. 
 * 
 */
import java.awt.geom.Point2D;   //This class uses Point2D to compute the 
public class Triangle {         //properties of a triangle
    
    private Point2D.Double point1;
    private Point2D.Double point2;
    private Point2D.Double point3;
    
    /**
     * The constructor for the Triangle class using Point2D objects
     * @param point1 is the first point of a triangle
     * @param point2 is the second point of a triangle
     * @param point3 is the third point of a triangle
     */
    
    public Triangle (Point2D.Double point1, Point2D.Double point2,
           Point2D.Double point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    /**
     * Accessor method to return the first point
     * @return point1
     */
    public Point2D.Double getPoint1(){
        return point1;
    }
    
    /**
     * Accessor method to return the second point
     * @return point2
     */
    public Point2D.Double getPoint2(){
        return point2;
    }
    
    /**
     * Accessor method to return the third point
     * @return point3
     */
    public Point2D.Double getPoint3(){
        return point3;
    }
    
    /**
     * Mutator method to set a new point (new point must be a Point2D object)
     * @param newPoint the new first point object
     */
    public void setPoint1(Point2D.Double newPoint){
        point1 = newPoint;
    }
    
    /**
     * Mutator method to set a new point (new point must be a Point2D object)
     * @param newPoint the new third point object
     */
    public void setPoint2(Point2D.Double newPoint){
        point2 = newPoint;
    }
    
    /**
     * Mutator method to set a new point (new point must be a Point2D object)
     * @param newPoint the new third point object
     */
    public void setPoint3(Point2D.Double newPoint){
        point3 = newPoint;
    }
    
    /**
     * A method to compute the distance between point1 and point2
     * @return the distance between point1 and point2
     */
    public double computeSide1(){
        return point1.distance(point2);
    }
    
    /**
     * A method to compute the distance between point2 and point3
     * @return the distance between point2 and point3
     */
    public double computeSide2(){
        return point2.distance(point3);
    }
    
    /**
     * A method to compute the distance between point3 and point1
     * @return the distance between point3 and point1
     */
    public double computeSide3(){
        return point3.distance(point1);
    }
    
    /**
     * A method to compute the perimeter of a triangle P = side1 + side2 + side3
     * @return the perimeter
     */
    public double perimeter(){
        return computeSide1() + computeSide2() +computeSide3();
    }
    
    /**
     * A method to compute the area of a triangle using Heron's formula
     * S = perimeter / 2
     * area = sqrt(s * (s - side1) * (s - side2) * (s - side3))
     * @return the area
     */
    public double area(){
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - computeSide1()) * (s - computeSide2()) * 
            (s - computeSide3()));
    }
    
    /**
     * A method to compute if the object is a valid triangle
     * @return if the Triangle object is actually a triangle
     */
    public boolean isTriangle(){
        return computeSide1() + computeSide2() > computeSide3() 
                && computeSide2() + computeSide3() > computeSide1() 
                && computeSide1() + computeSide3() > computeSide2();
    }
    
    /**
     * A method to compute the angle of the first point by using law of cosines
     * Acos (point1) = ((side1)^2 + (side2)^2 - (side3)^2) / 2 * side1 * side2
     * @return the angle at point1 to the nearest degree
     */
    public int angleOfPoint1(){
        double angle = Math.acos((Math.pow(computeSide3(), 2) 
            + Math.pow(computeSide1(), 2) - Math.pow(computeSide2(), 2)) 
            / (2 * computeSide3() * computeSide1()));
        angle = Math.toDegrees(angle);
        return (int) Math.round(angle);
    }
    
    /**
     * A method to compute the angle of the second point by using law of cosines
     * Acos (point2) = ((side2)^2 + (side1)^2 - (side3)^2) / 2 * side2 * side1
     * @return the angle at point2 to the nearest degree
     */
    public int angleOfPoint2(){
        double angle = Math.acos((Math.pow(computeSide2(), 2) 
            + Math.pow(computeSide1(), 2) - Math.pow(computeSide3(), 2)) 
            / (2 * computeSide2() * computeSide1()));
        angle = Math.toDegrees(angle);
        return (int) Math.round(angle);
    }
    
    /**
     * A method to compute the angle of the third point by using law of cosines
     * Acos (point3) = ((side3)^2 + (side2)^2 - (side1)^2) / 2 * side3 * side2
     * @return the angle at point3 to the nearest degree
     */
    public int angleOfPoint3(){
        double angle = Math.acos((Math.pow(computeSide3(), 2) 
            + Math.pow(computeSide2(), 2) - Math.pow(computeSide1(), 2)) 
            / (2 * computeSide3() * computeSide2()));
        angle = Math.toDegrees(angle);
        return (int) Math.round(angle);
    }
          
}
