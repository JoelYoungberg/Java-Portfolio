package employee_exe_10_10;
 
/**
 *
 * @author Joel R. Youngberg
 */
public class PieceWorker extends Employee {
    private double wage; //wage per piece
    private double pieces; //number of pieces produced
 
    // five-argument constructor
    public PieceWorker( String first, String last, String ssn, Date DayOfBirth, double Wage, double Pieces )
    {
      super( first, last, ssn, DayOfBirth);
      setWage( Wage ); // validate and store wage
      setPieces( Pieces ); // validate and store pieces;
    } // end five-argument HourlyEmployee constructor
 
    // set wage
    public final void setWage( double Wage )
    {
      wage = ( Wage < 0.0 ) ? 0.0 : Wage;
    } // end method setWage
 
    // return wage
    public double getWage()
    {
      return wage;
    } // end method getWage
 
    // set Pieces
    public final void setPieces( double Pieces )
    {
      pieces = ( ( Pieces >= 0.0 ) && ( Pieces <= 168.0 ) ) ?
         Pieces : 0.0;
    } // end method setPieces
 
    // return pieces
    public double getPieces()
    {
      return pieces;
    } // end method getPieces
 
    // calculate earnings; override abstract method earnings in Employee
    public double earnings()
    {
      return getWage() * getPieces();
    } // end method earnings
 
    // return String representation of PieceWorker object
    @Override
    public String toString()
    {
      return String.format( "Piece Worker: %s\n%s: $%,.2f; %s: %,.2f",
         super.toString(), "Wage per piece", getWage(),
         "Number of pieces produced", getPieces() );
    } // end method toString
 
}