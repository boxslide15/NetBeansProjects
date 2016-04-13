package lab1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       
       Rectangle box = new Rectangle(0,0,480,480);
       Ellipse2D.Double circle = new Ellipse2D.Double(0,0,480,480);
       
       int [] x1 = {0, 240, 480};
       int [] y1 = {480, 240, 480};
       
       Polygon triangleOne = new Polygon(x1,y1,3);
       
       int [] x2 = {480,720,960};
       int [] y2 = {480,240,480};
       Polygon triangleTwo = new Polygon(x2,y2,3);
       
       int [] x3 = {240,480,720};
       int [] y3 = {240,0,240 };
       Polygon triangleThree = new Polygon(x3,y3,3);
       
       int [] x4 = {360,480,600};
       int [] y4 = {360,240,360};
       Polygon triangleFour = new Polygon(x4,y4,3);
       
       g2.draw(triangleOne);   
       g2.setColor(new Color(100, 241, 84));
       g2.fill(triangleOne);
       
       g2.draw(triangleTwo);   
       g2.setColor(new Color(100, 241, 84));
       g2.fill(triangleTwo);
       
       g2.draw(triangleThree);   
       g2.setColor(new Color(100, 241, 84));
       g2.fill(triangleThree);
       
       g2.draw(triangleFour);   
       g2.setColor(new Color(100, 241, 84));
       g2.fill(triangleFour);
    }
}
