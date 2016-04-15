/**
 *
 * @author Luis Hernandez
 */
public class SpeedDatingTest {

    public static void main(String[] args) {

        // create a SpeedDating object
        SpeedDating mySpeedDate = new SpeedDating();

        // call the happyBirthDaze() method and print results.
        mySpeedDate.happyBirthDaze(12, 10);

        // call and print the pollDancer() method
        System.out.println("\nElection day is on: " + mySpeedDate.pollDancer(2016).getMediumDate());

        // Date object for the iExcel() method
        Date myDate = new Date(4, 7, 2015);

        // Prints the number of days past the excel Date starting from 1/1/1900
        System.out.println("\nThe Excel date for " + myDate.getMediumDate() + " is: #" + mySpeedDate.iExcel(myDate));

    }

}
