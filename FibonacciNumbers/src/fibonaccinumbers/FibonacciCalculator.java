 // Fig. 18.5: FibonacciCalculator.java
 // Recursive fibonacci method.
package fibonaccinumbers;

 import java.math.BigInteger;
 import java.util.Date;
import javax.swing.*;
import java.awt.*;
 import javax.swing.JOptionPane; 
 import javax.swing.JTextArea;


public class FibonacciCalculator
 {
 private static JTextArea textArea;
 private static int numCalls;
 private static BigInteger TWO = BigInteger.valueOf( 2 );

// recursive declaration of method fibonacci
public static BigInteger fibonacci( BigInteger number )
{
    numCalls++;
if ( number.equals( BigInteger.ZERO ) ||
     number.equals( BigInteger.ONE ) ) // base cases
     return number;
   else // recursion step
     return fibonacci( number.subtract( BigInteger.ONE )).add(
fibonacci( number.subtract( TWO ) ) );
}//end method fibonacci


 // displays the fibonacci values from 0-40
 public static void main( String[] args )
 {
     
     System.out.println("Thank you for using the Recursion/Loop ");
     System.out.println("Fibonacci comparison program. ");
     System.out.println("Time of calculation is: ");
     Date date = new Date();
     System.out.println(date.toString());
     
 long time1 = System.currentTimeMillis();//Beginning Time
 
 for ( int counter = 0; counter <= 40; counter++ )
 System.out.printf( "Fibonacci of %d is: %d\n", counter,
 fibonacci(BigInteger.valueOf(counter)));
 
 long time2 = System.currentTimeMillis();//Ending Time
 
 System.out.printf("%s%d","Duration of calculation in Milliseconds: ", time2 - time1);
 System.out.println();
 System.out.printf("%s%d","Number of times Fibonacci Method Called: ", numCalls);
 System.out.println();
 
 System.out.println();
 System.out.println("Extra Credit Comparison: Fibonacci Loop");
 long time3 = System.currentTimeMillis();//Beginning Time For Loop Section
 int fibNum1=0;
 int fibNum2=1;
 int fibSum;
 System.out.println("Fibonacci of 0 is 0");
 for (int i =1; i <= 40; i++){
     fibSum = fibNum1 + fibNum2;
     fibNum2 = fibNum1;
     fibNum1 = fibSum;
     System.out.printf("%s%d%s%d","Fibonacci of ", i ," is ", fibSum);
     
     JLabel t1 = new JLabel("Fibonacci of " + i + " is " + fibSum);
     System.out.println();
 }
 long time4 = System.currentTimeMillis();//Ending Time For Loop Section
 
 //Outputting results
 System.out.println();
 System.out.printf("%s%d","Duration of calculation in Milliseconds for Loop Version: ", time4 - time3);
 System.out.println();
 System.out.printf("%s%d","Duration of calculation in Milliseconds for Recursion Version: ", time2 - time1);
 System.out.println();
 
 System.out.println("If it wasn't already obvious while observing the program");
 System.out.println("during runtime, it can be seen above that the looping ");
 System.out.println("version of the Fibonacci sequence is much faster... ");
 
 } // end main
 } // end class FibonacciCalculator

