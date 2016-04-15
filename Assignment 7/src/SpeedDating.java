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
         for (int currentYear = 2015; currentYear <= 2025; currentYear++){                                          // for all the years from 2015-2025...
             Date d1 = new Date(theMonth, theDay, currentYear);                                                     // create a Date() object with parameters set by the user
             System.out.println("Your birthday is on a " + d1.getDayOfWeek() + " in the year: " + currentYear);     // print the day of the week on which the users birthday falls
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
         int day = 1;
         Date myDate = new Date(11, day, year);             // create a date object
         while (!"Monday".equals(myDate.getDayOfWeek())){   // checks to see if its the first Monday of the month
             myDate.next();
         }
         if (!"Tuesday".equals(myDate.getDayOfWeek())){     // checks to see if the first Tuesday of the month is after the first Monday of the month
                 myDate.next();
             }
         return myDate;                                     // return the Election day for that year
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
 	 Date excelDate = new Date(1, 1, 1900);    // create the excel date to compare number of days
         Date myDate = aDate;                      // the user inputed Date
         int day = 1;                              // initialized the counter
         while (!myDate.equals(excelDate)){        // check to see if the user Date is the same as the excel Date
             day++;                                // add one day to the counter
             myDate.previous();                    // moves the user inputed Date back to the excel Date
         }
         return day;
      }
 }
