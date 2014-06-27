//Joel Youngberg 8Oct2013 Fig. 
//6.8: Craps.java simulates the dice game craps.

package exercise6_33_crapsgamemod;

import java.util.Random;//Bringing in random number generation
import java.util.Date; //Bringing in date and time function
import java.util.Scanner; //Bringing in scanner function

public class Exercise6_33_CrapsGameMod {
// create random number generator for use in method rollDice
private static final Random randomNumbers = new Random();

// enumeration with constants that represent the game status
private enum Status { CONTINUE, WON, LOST };

// constants that represent common rolls of the dice
private static final int SNAKE_EYES = 2;
private static final int TREY = 3;
private static final int SEVEN = 7;
private static final int YO_LEVEN = 11;
private static final int BOX_CARS = 12;

 // plays one game of craps
public static void main( String[] args )
{
    //Variable and object definitions
    float incAmt;
    float wager;
    float balance = 1000;
    Date date = new Date();
    Scanner input = new Scanner(System.in);
    
    //Program opening statement and inputs
    System.out.print("Thank you for using the craps casino application!");
    System.out.println();
    System.out.print("Time of game start is: ");
        System.out.println(date.toString());
        System.out.println("The odds payout is: 4 & 10: 2 to 1, 5 & 9: 3 to 2, 6 & 8: 6 to 5");
        System.out.println();
 do{
    System.out.print("Please enter a wager(cannot be more than balance): ");
    System.out.println();
        wager = input.nextFloat();
 }while(wager > balance);
    
    
int myPoint = 0; // point if no win or loss on first roll
Status gameStatus; // can contain CONTINUE, WON or LOST

int sumOfDice = rollDice(); // first roll of the dice

// determine game status and point based on first roll
switch ( sumOfDice )
{
  case SEVEN: // win with 7 on first roll
  case YO_LEVEN: // win with 11 on first roll
    gameStatus = Status.WON;
    break;
  case SNAKE_EYES: // lose with 2 on first roll
  case TREY: // lose with 3 on first roll
  case BOX_CARS: // lose with 12 on first roll
    gameStatus = Status.LOST;
    break;
  default: // did not win or lose, so remember point
    gameStatus = Status.CONTINUE; // game is not over
    myPoint = sumOfDice; // remember the point
    System.out.printf( "Point is %d\n", myPoint );
    
    break; // optional at end of switch
 } // end switch

 // while game is not complete
while(gameStatus == Status.CONTINUE)// not WON or LOST
 {
    do{
  System.out.println("Would you like to increase your pass line bet?");
  System.out.println("Increase cannot exceed available balance.");
  System.out.println("If yes: Enter amount to be added, if no: Enter Zero:");
    incAmt = input.nextFloat();
    }while(incAmt+wager >= balance);
  wager += incAmt;
  sumOfDice = rollDice(); // roll dice again

  // determine game status
if ( sumOfDice == myPoint ) // win by making point
    gameStatus = Status.WON;
else
 if ( sumOfDice == SEVEN ) // lose by rolling 7 before point
    gameStatus = Status.LOST;
 } // end while

 // display won or lost message
 if(gameStatus == Status.WON ){
   System.out.println( "Player wins" );
   float odds = calcOdds(sumOfDice, wager);//Calculate amt of odds winnings bonus
   balance += (wager + odds);
   System.out.printf("%s%.2f","Your odds bonus is: $", odds);
   System.out.println();
   System.out.printf("%s%.2f","Your Total Bank Balance is now: $", balance);
   System.out.println();
 }
 else{
   System.out.println( "Player loses" );
   balance -= wager;
   System.out.printf("%s%.2f","Your Bank Balance is now: $", balance);
   System.out.println();
   }
   chatter(balance);//Creating random chatter
   System.exit(0);
 } ///////////////////////////////////////////////////////// end main

 // roll dice, calculate sum and display results
 public static int rollDice()
 {
 // pick random die values
 int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
 int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll

 int sum = die1 + die2; // sum of die values

 // display results of this roll
 System.out.printf( "Player rolled %d + %d = %d\n",
 die1, die2, sum );

return sum; // return sum of dice
 } // end method rollDice
 public static void chatter(float balance)
 {
    if(balance == 0){
     System.out.print("Sorry, You're busted! You have no money left!");
     System.out.println();
 }
 else {
     int comment = 1 + randomNumbers.nextInt( 5 ); // first die roll
     switch(comment){
         case 1: System.out.println("C'mon give it another roll!!");
             break;
         case 2: System.out.println("Don't stop now, you could win BIG!!");
             break;
         case 3: System.out.println("A big risk could turn into a big payoff!");
             break;
         case 4: System.out.println("Give it all you've got!!");
             break;
         case 5: System.out.println("You play craps like a gangster!!");
             break;
       }//End Switch
     }//End Else 
   }//End method chatter
 public static float calcOdds(int sumOfDice, float wager){
     float odds = 0;
    if (sumOfDice == 4 || sumOfDice == 10)
        odds = wager;
    if (sumOfDice == 5 || sumOfDice == 9)
        odds = (wager/2) * 3;
    if (sumOfDice == 6 || sumOfDice == 8)
        odds = (wager/5) * 6;
    return odds;
}
 } // end class Craps