package employee_exe_10_10;
 
/**
 *
 * @author Joel R. Youngberg
 */
public class Employee_Test_Exe_10_10
{
   public static void main( String args[] )
   {
      // create subclass objects
      System.out.println("Welcome to the payroll application:");
      Date currentDate = new Date(9,22,2013);
      System.out.printf( "Payroll Processing Date is: %s\n", currentDate.toString() );
      System.out.println("-------------------------------------");
      SalariedEmployee salariedEmployee =
         new SalariedEmployee( "Joel", "Youngberg", "123-45-6789", new Date(9,22,1981),1050.00 );
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee( "Bart", "Simpson", "000-00-0000", new Date(7,25,1989),18.25, 40 );
      CommissionEmployee commissionEmployee =
         new CommissionEmployee(
         "Billy", "Bones", "666-66-6666", new Date(0,00,0000),15000, .08 );
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee(
         "Harrison", "Ford", "987-65-4321", new Date(8,14,1965),6500, .06, 255 );
      PieceWorker pieceWorker = new PieceWorker("Jimmy", "Stewart", "777-777-777",
              new Date(12,25,1955), 568, 25);
 
      System.out.println( "Individual Employee Processes:\n" );
 
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         salariedEmployee, "earned", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "earned", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "earned", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         basePlusCommissionEmployee,
         "earned", basePlusCommissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
              pieceWorker, "earned", pieceWorker.earnings() );
 
      // create four-element Employee array
      Employee employees[] = new Employee[ 5 ];
 
      // initialize array with Employees
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee;
      employees[ 3 ] = basePlusCommissionEmployee;
      employees[ 4 ] = pieceWorker;
 
      System.out.println("-------------------------------------");
      System.out.println( "Employees processed polymorphically:\n" );
 
      // generically process each element in array employees
      for ( Employee currentEmployee : employees )
      {
         System.out.println( currentEmployee ); // invokes toString
 
         // determine whether element is a BasePlusCommissionEmployee
         if ( currentEmployee instanceof BasePlusCommissionEmployee )
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee =
               ( BasePlusCommissionEmployee ) currentEmployee;
 
            double oldBaseSalary = employee.getBaseSalary();
            employee.setBaseSalary( 1.10 * oldBaseSalary );
            System.out.printf(
               "New base salary with 10%% increase is: $%,.2f\n",
               employee.getBaseSalary() );
         } // end if
 
         if(currentDate.getMonth()==currentEmployee.getBirthday().getMonth())
         {
             System.out.printf("earned $%,.2f. %s\n\n", currentEmployee.earnings() + 100.00,
                     "Note: added a $100 bonus to payroll amount for birthday!!!" );
         }else{
             System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings() );
         }
      } // end for
 
      // get type name of each object in employees array
      for ( int j = 0; j < employees.length; j++ )
         System.out.printf( "Employee %d is a %s\n", j,
            employees[ j ].getClass().getSimpleName() );
   } // end main
} // end class PayrollSystemTest