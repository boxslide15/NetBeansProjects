/**
 * A class to give students experience using loops.  This class
 * creates and manipulates objects of Greg's Date class.
 */
 public class SpeedDating
 {
    // Note: this class has no instance variables!

    /**
     * Create an empty SpeedDating object
     */
     public SpeedDating()
     {}	   // Constructor has empty body
           // (this is known as a "default" constructor)

    /**
     * Computes and prints the day of the week on which the user's birthday
     * will fall for each year from 2015 to 2025 inclusive
     * @param theMonth the month of the birthday
     * @param theDay the day of the birthday
     */
     public void happyBirthDaze(int theMonth, int theDay)
     {
         // local variables
         int currentYear = 2015;
         int finalYear = 2025;
         int monthOfBirthday = theMonth;
         int dayOfBirthday = theDay;
         
         // create a Date() object with parameters set by the user
         Date d1 = new Date(monthOfBirthday, dayOfBirthday, currentYear);
         
         while(currentYear <= finalYear){
             d1.getMonthName();
             d1.getDayOfWeek();
             currentYear ++;
             
         }
     }

    /**
     * Computes and returns the Date on which Election Day will fall
     * in the USA for a given year.
     *
     * NOTE: By law, Election  Day is the first Tuesday after the first
     * Monday in November.
     *
     * @param year the year for which to compute the date of Election Day
     * @return the Date of Election Day for the specified year
     */
      public Date pollDancer(int year)
     {
         // TO DO: write the body of this method here
     }


     /**
      * Computes and returns the corrected "Excel Date" for a given Date.
      * I.e., the number of the given Date where 1/1/1900 is date #1
      *
      * @param aDate the Date for which to return the Excel Date
      * @return the Excel Date of aDate
      */
      public int iExcel(Date aDate)
      {
 	 // TO DO: write the body of this method here
      }
 }
