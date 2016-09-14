/**
 *
 * @author boxslide15
 */
import java.awt.geom.Point2D;
public class Triangle {
    
    private Point2D.Double point1;
    private Point2D.Double point2;
    private Point2D.Double point3;
    
    public Triangle (Point2D.Double point1, Point2D.Double point2,
           Point2D.Double point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    public Point2D.Double getPoint1(){
        return point1;
    }
    
    public Point2D.Double getPoint2(){
        return point2;
    }
    
    public Point2D.Double getPoint3(){
        return point3;
    }
    
    public void setPoint1(Point2D.Double newPoint){
        point1 = newPoint;
    }
    
    public void setPoint2(Point2D.Double newPoint){
        point2 = newPoint;
    }
    
    public void setPoint3(Point2D.Double newPoint){
        point3 = newPoint;
    }
    
    public double computeSide1(){
        return point1.distance(point2);
    }
    
    public double computeSide2(){
        return point2.distance(point3);
    }
    
    public double computeSide3(){
        return point3.distance(point1);
    }
    
    public double perimeter(){
        return computeSide1() + computeSide2() +computeSide3();
    }
    
    public double area(){
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - computeSide1()) * (s - computeSide2()) * 
            (s - computeSide3()));
    }
    
    public int angleOfPoint1(){
        double angle = Math.acos((Math.pow(computeSide3(), 2) 
            + Math.pow(computeSide1(), 2) - Math.pow(computeSide2(), 2)) / (2 
            * computeSide3() * computeSide1()));
        angle = Math.toDegrees(angle);
        return (int) Math.round(angle);
    }
    
    public int angleOfPoint2(){
        double angle = Math.acos((Math.pow(computeSide2(), 2) 
            + Math.pow(computeSide1(), 2) - Math.pow(computeSide3(), 2)) / (2 
            * computeSide2() * computeSide1()));
        angle = Math.toDegrees(angle);
        return (int) Math.round(angle);
    }
    
    public int angleOfPoint3(){
        double angle = Math.acos((Math.pow(computeSide3(), 2) 
            + Math.pow(computeSide2(), 2) - Math.pow(computeSide1(), 2)) / (2 
            * computeSide3() * computeSide2()));
        angle = Math.toDegrees(angle);
        return (int) Math.round(angle);
    }
          
}
