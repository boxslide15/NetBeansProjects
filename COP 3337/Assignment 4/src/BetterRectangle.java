/**
 * @author Luis F Hernandez 5163353
 * @version 10/17/2016
 * Class: COP 3337-U09
 * Assignment #4
 * 
 * A subclass to enhance the Rectangle class which adds methods to compute the 
 * area and perimeter of a Rectangle.
 * 
 * To compile and execute: 
 *   javac BetterRectangle.java BetterRectangleTester.java
 *   java BetterRectangleTester
 * 
 * I hereby certify that this collective work is my own and none of it is 
 * the work of any other person or entity. 
 * 
 */
import java.awt.Rectangle;
public class BetterRectangle extends Rectangle {
    
    /**
     * A BetterRectangle constructor with no parameters which creates a
     * Rectangle with coordinates at (0, 0) and a width and height of 0
     */
    public BetterRectangle(){
        super.setLocation(0, 0);
        super.setSize(0, 0);
    }
    
    /**
     * The BetterRectangle constructor with two parameters, width and height.
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public BetterRectangle(int width, int height){
        super.setLocation(0, 0);
        super.setSize(Math.abs(width), Math.abs(height));
    }
    
    /**
     * The BetterRectangle constructor with four parameters, the upper left x 
     * and y coordinates of the rectangle, the width and height.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width of the rectangle
     * @param height  the height rectangle
     */
    public BetterRectangle(int x, int y, int width, int height){
        super.setLocation(x, y);
        super.setSize(Math.abs(width), Math.abs(height));
    }
    
    /**
     * A method to compute the area of the rectangle A = l * w
     * @return the area of the rectangle
     */
    public double getArea(){
        return super.getWidth() * super.getHeight();
    }
    
    /**
     * A method to compute the perimeter of the rectangle P = 2 * (l * w)
     * @return the perimeter of the rectangle
     */
    public double getPerimeter(){
        double area = 2 * (super.getWidth() + super.getHeight());
        return area;
    }
    
    /**
     * A method that overrides the super.toString() method and outputs the x, y,
     * width, height, area, and perimeter values of a BetterRectangle object.
     * @return values of the BetterRectangle object
     */
    public String toString(){
        return "x: " + x + " units\ny: " + y + " units\nwidth: " + width 
                + " units\nheight: " + height + " units\nArea: " + getArea() 
                + " units\nPerimeter: " + getPerimeter() + " units";
    }
    
}
