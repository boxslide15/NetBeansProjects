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
public class BetterRectangleTester {

    public static void main(String[] args) {
       
        BetterRectangle subRect = new BetterRectangle(10, 10);
        BetterRectangle subRect2 = new BetterRectangle(0, 0, 10, 10);
        BetterRectangle noSubRect = new BetterRectangle();
        Rectangle baseRect = new Rectangle(10, 10);
        
        BetterRectangle newRect = new BetterRectangle(215, 664, 413, 975);
        BetterRectangle otherRect = new BetterRectangle(15, 769, 93, 35);
        Rectangle noRect = new Rectangle();
        
        System.out.println("subRect Rectangle:\n" + subRect + "\n\n" 
                + "subRect2 Rectangle:\n" + subRect2 + "\n\n" 
                +  "newRect Rectangle:\n" + newRect + "\n\n" 
                + "otherRect Rectangle:\n" + otherRect + "\n\n" 
                + "noRect Rectangle:\n" + noRect + "\n\n" 
                +  "baseRect Rectangle:\n" + baseRect + "\n\n" 
                + "noSubRect Rectangle:\n" + noSubRect + "\n");

        System.out.println("Is baseRect equal to subRect?: " + baseRect.equals(subRect));
        System.out.println("Is subRect equal to baseRect?: " + subRect.equals(baseRect));
        System.out.println("Is subRect equal to subRect2?: " + subRect.equals(subRect2));
        System.out.println("Is noSubRect equal to noRect?: " + noSubRect.equals(noRect));
        
        System.out.println("Is newRect equal to otherRect?: " + newRect.equals(otherRect));
        System.out.println("Is newRect equal to subRect?: " + newRect.equals(subRect));
        
    }
    
}
