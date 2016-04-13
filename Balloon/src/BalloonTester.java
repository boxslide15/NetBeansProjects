/**
 * @author Luis Hernandez
 */
public class BalloonTester 
{
    public static void main(String[] args) 
    {
        // Steps 1-3
        Balloon balloon1 = new Balloon("Balloon 1", 100); 
        Balloon balloon2 = new Balloon("Balloon 2", -100);
        
        System.out.println(balloon1.getName() + " Altitude: " + balloon1.getAltitude() + 
                "\n" + balloon2.getName() + " Altitude: " + balloon2.getAltitude() + "\n"); // printed statements of the balloon objects and their altitudes
        
        // Steps 4-6
        balloon1.ascendTo(300); 
        balloon2.adjustAltitude(200);
        
        System.out.println(balloon1.getName() + " Altitude: " + balloon1.getAltitude() + 
                "\n" + balloon2.getName() + " Altitude: " + balloon2.getAltitude() + "\n"); // printed statements of the balloon objects and their altitudes
        
        // Steps 7-9
        balloon1.adjustAltitude(-150);
        balloon2.descendTo(balloon1.getAltitude());
        
        System.out.println(balloon1.getName() + " Altitude: " + balloon1.getAltitude() + 
                "\n" + balloon2.getName() + " Altitude: " + balloon2.getAltitude() + "\n"); // printed statements of the balloon objects and their altitudes
        
        // Steps 10-12
        balloon1.ascendTo(balloon1.getAltitude() * 3);
        balloon2.descendTo(balloon2.getAltitude() - 200);
        
        System.out.println(balloon1.getName() + " Altitude: " + balloon1.getAltitude() + 
                "\n" + balloon2.getName() + " Altitude: " + balloon2.getAltitude() + "\n"); // printed statements of the balloon objects and their altitudes
    }
    
}
