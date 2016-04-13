package lab1;
import java.awt.Graphics;
import javax.swing.JFrame;

public class EmptyFrameViewer 
{
    public static void main(String [] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Car");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CarComponent component = new CarComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}