package DeckOfCards;
 // Joel R. Youngberg
 // Fig. 7.11: DeckOfCardsTest.java modification
 // Card shuffling and dealing - Evaluating hands exercise 7.30
import java.util.Date; //Bringing in date and time function

public class DeckOfCardsTest
 {
 // execute application
 public static void main( String[] args )
{   
 Date date = new Date();
 System.out.println("Thank you for using the poker application!");
 System.out.println("Time of game/calculation is: ");
 System.out.println(date.toString());
 System.out.println();
 //Array declarations and initialization of random hand of cards-
 DeckOfCards myDeckOfCards = new DeckOfCards();
 myDeckOfCards.shuffle(); // place Cards in random order
 DeckOfCards.Card[] aryHand = new DeckOfCards.Card[5];//Array for five card deal
 //Frequency array - First index stays zero, others increment from 1-13
 int[] aryFreq = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
 
 // deal and display five cards
   System.out.println("Original hand of cards: ");
   for ( int i = 0; i < 5; i++ )//Filling hand array with five random cards
   {
   aryHand[i] = myDeckOfCards.dealCard();//Filling Hand Array with random cards!!
   System.out.printf("%s  ",aryHand[i]);//Displaying hand
   } // end for
   
     for ( int i = 0; i < 5; i++ ){
         ++aryFreq[aryHand[i].fValue];//Incrementing Freq Array counters with hand face values
     }
     System.out.println();
     
     //Beginning to analyze hand of cards...
     myDeckOfCards.sort(aryHand); // Sort hand of cards in ascending order
       
    //Displaying hand of cards (this time sorted from lowest to highest)
    System.out.println();
    System.out.println("Sorted hand of cards: ");
    for(int i = 0; i<5; i++)
    System.out.printf("%s  ",aryHand[i]);//Displaying hand
     
     myDeckOfCards.chkPair(aryFreq); // Check for pair & two pair
     
     myDeckOfCards.chkThreeFour(aryFreq); // Check for three & four of a kind
     
     myDeckOfCards.chkFullHouse(aryFreq); // Check for full house
     
     myDeckOfCards.chkStraight(aryHand); // Check for straight/ace high straight
     
     myDeckOfCards.chkFlush(aryHand); // Check for flush
     
     System.out.println();
     System.exit(0);
     
   } // end main
 
 } // end class DeckOfCardsTest
////////////////End DeckOfCardsTest/////////////////////////////////////
