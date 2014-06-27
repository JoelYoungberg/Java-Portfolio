
//Joel R. Youngberg
// Fig. 7.10: DeckOfCards.java DeckOfCards class represents a deck of playing cards.
package DeckOfCards;
import java.util.Random;

public class DeckOfCards //Deck of Cards class
{//Variable Declarations
 private Card[] deck; //array of Card objects
 private int currentCard; // index of next Card to be dealt (0-51)
 private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
 // random number generator
 private static final Random randomNumbers = new Random();
 

 // Fig. 7.9: Card.java
// Card class represents a playing card.

public class Card
 {
 public String face; // face of card ("Ace", "Deuce", ...)
 public String suit; // suit of card ("Hearts", "Diamonds", ...)
 public int fValue;//value of card that reflects face 1-13
 // two-argument constructor initializes card's face and suit
public Card( String cardFace, String cardSuit, int cardValue )
 {
 face = cardFace; // initialize face of card
 suit = cardSuit; // initialize suit of card
 fValue = cardValue; // initialize face value of card
 } // end two-argument Card constructor
// return String representation of Card
public String toString()
{
return face + " of " + suit;
} // end method toString
 } // end class Card
 
 // constructor fills deck of Cards
 public DeckOfCards()// deck of cards
 {
   String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
      "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
   String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
   int[] faceValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};

   deck = new Card[ NUMBER_OF_CARDS ]; // create array of Card objects
   currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]

   // populate deck with Card objects
   for ( int count = 0; count < deck.length; count++ )
   deck[ count ] =
   new Card( faces[ count % 13 ], suits[ count / 13 ], faceValues[count % 13] );
   } // end DeckOfCards constructor
// shuffle deck of Cards with one-pass algorithm
public void shuffle()
 {
 // after shuffling, dealing should start at deck[ 0 ] again
 currentCard = 0; // reinitialize currentCard

 // for each Card, pick another random Card (0-51) and swap them
 for ( int first = 0; first < deck.length; first++ )
   {
 // select a random number between 0 and 51
 int second = randomNumbers.nextInt( NUMBER_OF_CARDS );

 // swap current Card with randomly selected Card
  Card temp = deck[ first ];
  deck[ first ] = deck[ second ];
  deck[ second ] = temp;


   } // end for
 } // end method shuffle

 // deal one Card
 public Card dealCard()
   {
 // determine whether Cards remain to be dealt
 if( currentCard < deck.length )
 return deck[ currentCard++ ]; // return current Card in array
 else
 return null; // return null to indicate that all Cards were dealt
   } // end method dealCard 
 
 
 //check for pair & two pair
 public void chkPair(int[] aryFreq){
     int pair =2;
     int numPairs =0;
     for ( int i = 1; i <= 13; i++ ){
         if(aryFreq[i] == pair){
             numPairs++;
         }
     }//End For loop check for pair
     if (numPairs == 1){
             System.out.println();
             System.out.print("You have a pair!");
         }
         else if (numPairs == 2){//Checking for two pair
             System.out.println();
             System.out.print("You have two pairs!");
         }//end check for pairs
 }//End method chk pairs
 
 public void chkThreeFour(int[] aryFreq){
 //check for three & four of a kind
       for ( int i = 1; i <= 13; i++ ){
         if(aryFreq[i] == 3)
             System.out.println("You have three of a kind!");
         else if(aryFreq[i] == 4)
             System.out.println("You have four of a kind!");
         }//End check for three & four of a kind
 }//End method chk 3&4
 
 public void chkFullHouse(int[] aryFreq){
     //check for full house
       int fullHouse =0;
       for ( int i = 1; i <= 13; i++ ){
           if (aryFreq[i] == 2){
               fullHouse++;
               if(fullHouse == 2)//Check to make sure two pairs does not
                   fullHouse--;  //Trigger full house response
           }
           if (aryFreq[i] == 3)
               fullHouse++;
       }
       if (fullHouse == 2)
           System.out.println("You have a full house!!");
 }
 
 public void sort(DeckOfCards.Card[] aryHand){
     //sort hand array first ( -bubble sort- to make things easier...)
       Boolean swap;
       int fValueTemp;
       String faceTemp;
       String suitTemp;
       
    do{
    swap = false;
    for (int count = 0; count < 5 -1; count++)
    {
        if (aryHand[count].fValue > aryHand[count + 1].fValue)
        {
            fValueTemp = aryHand[count].fValue;
            faceTemp = aryHand[count].face;
            suitTemp = aryHand[count].suit;
            aryHand[count].fValue = aryHand[count + 1].fValue;
            aryHand[count].face = aryHand[count + 1].face;
            aryHand[count].suit = aryHand[count + 1].suit;
            aryHand[count + 1].fValue = fValueTemp;
            aryHand[count + 1].face = faceTemp;
            aryHand[count + 1].suit = suitTemp;
            swap = true;
        }
      }
    }while(swap);
 }// End Bubble Sort
 
 //check for straight and ace high straight
 public void chkStraight(DeckOfCards.Card[] aryHand){
     //check for straight
    //test for straight (ace low)
     int aceHigh =0;
    int straight =0;
    for(int i = 0; i<4; i++){
        if(aryHand[i].fValue == aryHand[i+1].fValue -1)
            straight++;
    }
    if (straight == 4)
        System.out.println("You have a straight!");
    
    //test for straight (ace high)
    if(aryHand[0].fValue == 1)
        aceHigh++;
    if(aryHand[1].fValue == 10)
        aceHigh++;
    if(aryHand[2].fValue == 11)
        aceHigh++;
    if(aryHand[3].fValue == 12)
        aceHigh++;
    if(aryHand[4].fValue == 13)
        aceHigh++;
    
    if (aceHigh == 5)
        System.out.println("You have an ace high straight!");
 }// end method chkStraight
 
 public void chkFlush(DeckOfCards.Card[] aryHand){
     //test for flush
     int flush =0;
        for(int i = 0; i<4; i++){
            if(aryHand[i].face == aryHand[i+1].face)
                flush++;
        }
    if (flush == 4)
        System.out.println("You have a flush!");
 }
 
 } // end class DeckOfCards






