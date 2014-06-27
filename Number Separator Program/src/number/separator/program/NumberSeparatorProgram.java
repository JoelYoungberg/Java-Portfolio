/*
 * Author: Joel Youngberg
 * Project: Exercise 2.30 Separating the digits in an integer.
 * Date: 7 Sep 2013
 */
package number.separator.program;
import java.util.Scanner; //Bringing in scanner function

public class NumberSeparatorProgram {

    
    public static void main(String[] args) {
        // Creating Scanner
        Scanner input = new Scanner(System.in);
        //Additional variable declarations for calculations
        int num;
        
        System.out.print("This program divides a five digit integer"
                + " into separate digits.");
        System.out.print("\nPlease enter a five digit integer:");
        
        //Getting integer from user
        num = input.nextInt();
        
        //Performing separation
        int fifth = num/10000;
        int rem4 = num%10000;
        
        int fourth = rem4/1000;
        int rem3 = rem4%1000;
        
        int third = rem3/100;
        int rem2 = rem3%100;
        
        int second = rem2/10;
        int rem1 = rem2%10;
        
        int first = rem1/10;
        int rem0 = rem1/1;
        
        int zero = rem0;
        
        System.out.printf("%d   %d   %d   %d   %d   ",fifth, fourth, third,
                second, zero);
        
        System.exit(0);
    }//Close method
}//Close class
