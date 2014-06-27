package employee_exe_10_10;
 
/**
 * @author Joel R. Youngberg
 */

 
public class Date
{
   private int month; // 1-12
   private int day;   // 1-31 based on month
   private int year;  // any year
 
   // constructor: call checkMonth to confirm proper value for month;
   // call checkDay to confirm proper value for day
   public Date( int theMonth, int theDay, int theYear )
   {
      month = theMonth; // validate month
      year = theYear; // could validate year
      day = checkDay( theDay ); // validate day
   } // end Date constructor
 
   public void setMonth(int theMonth)
   {
       month = theMonth;
   }
 
   // utility method to confirm proper month value
   public int getMonth()
   {
      if ( month > 0 && month <= 12 ) // validate month
         return month;
      return 0;
   } // end method checkMonth
 
   // utility method to confirm proper day value based on month and year
   private int checkDay( int testDay )
   {
      int daysPerMonth[] =
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
 
      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
 
      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
 
      return 0;  // maintain object in consistent state
   } // end method checkDay
 
   // return a String of the form month/day/year
    @Override
   public String toString()
   {
      return String.format( "%d/%d/%d", month, day, year );
   } // end method toString
} // end class Date