package employee_exe_10_10;
 
/**
 *
 * @author Joel R. Youngberg
 */
public class SalariedEmployee extends Employee
{
   private double weeklySalary;
 
   // four-argument constructor
   public SalariedEmployee( String first, String last, String ssn, Date DayOfBirth, double salary )
   {
      super( first, last, ssn, DayOfBirth); // pass to Employee constructor
      setWeeklySalary( salary ); // validate and store salary
   } // end four-argument SalariedEmployee constructor
 
   // set salary
   public final void setWeeklySalary( double salary )
   {
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   } // end method setWeeklySalary
 
   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } // end method getWeeklySalary
 
   // calculate earnings; override abstract method earnings in Employee
   public double earnings()
   {
      return getWeeklySalary();
   } // end method earnings
 
   // return String representation of SalariedEmployee object
    @Override
   public String toString()
   {
      return String.format( "salaried employee: %s\n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary() );
   } // end method toString
} // end class SalariedEmployee