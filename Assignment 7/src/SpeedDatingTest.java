/**
 *
 * @author Luis Hernandez
 */
import java.util.Scanner;
public class SpeedDatingTest {

    public static void main(String[] args) {

        // create a SpeedDating object
        SpeedDating mySpeedDate = new SpeedDating();

        // create scanner object
        Scanner in = new Scanner(System.in);

        // call the happyBirthDaze() method and print results.
        int month, day;
        System.out.print("Please enter your birth month: ");
        month = in.nextInt();
        System.out.print("\nPlease enther your birth day: ");
        day = in.nextInt();
        mySpeedDate.happyBirthDaze(month, day);

        // call and print the pollDancer() method
        int year;
        System.out.print("\nPlease enter a year to calculate when Election Day is held: ");
        year = in.nextInt();
        System.out.println("\nElection day is on: " + mySpeedDate.pollDancer(year).getMediumDate());

        // Date object for the iExcel() method
        int exMonth, exDay, exYear;
        System.out.print("\nPlease enter the month: ");
        exMonth = in.nextInt();
        System.out.print("\nPlease enter the day: ");
        exDay = in.nextInt();
        System.out.print("\nPlease enter the year: ");
        exYear = in.nextInt();

        Date myDate = new Date(exMonth, exDay, exYear);

        // Prints the number of days past the excel Date starting from 1/1/1900
        System.out.println("\nThe Excel date for " + myDate.getMediumDate() + " is: #" + mySpeedDate.iExcel(myDate));

    }

}
