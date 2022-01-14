import java.util.ArrayList;
import java.util.Collections;

/**
 * A class to represent a deck of cards
 *
 * @author (Matthew Ford)
 * @version (2022.01.11)
 */
public class Deck
{
    // Declare a private ArrayList of cards
    private ArrayList<Card> cards;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // Loop through the Suit values
        // Inside that loop, loop through the numbers 2 - 15
        // Build a card using the outer loop's suit
        // and using this loop's index for the value.  Everything from 10 - King has a value of 10, and Ace has a value of 11
        // Put this newly created card in the cards ArrayList
        // Call the static method Collections.shuffle and pass it the cards ArrayList.  This will shuffle the cards for you

        cards = new ArrayList<Card>(); 

        for(Suit suit : Suit.values()) 
        {
            for(int i = 2 ; i <= 14 ; i++)
            {
                String cardName = "";
                int value = 0;
                if(i <= 10)
                {
                    cardName = String.valueOf(i);
                    value = i; 

                }
                else if(i == 11)
                {
                    cardName = "Ace";
                    value = 11; 
                }
                else if(i == 12)
                {
                    cardName = "Jack";
                    value = 10; 
                }
                else if(i == 13)
                {
                    cardName = "Queen";
                    value = 10; 
                }
                else if(i == 14)
                {
                    cardName = "King";
                    value = 10; 
                }  

                cards.add(new Card(suit,value,true,cardName));      

            }

            Collections.shuffle(cards);
        }

    }

    /**
     * Deal a card from the deck
     * @return A Card from the deck
     */
    public Card deal()
    {
        // Call the remove method on the cards ArrayList, always using index number 0, and return this card
        Card removedCard = cards.remove(0);
        return removedCard;
    }

    /**
     * Report on the size of the remaining cards in the deck
     * @return The number of cards left in the deck
     */
    public int cardsLeftInDeck()
    {
        // Return the size of the cards collection
        int size = cards.size();
        return size;

    }

    /*
     * Returns 52 pick-up
     */
    @Override
    public String toString()
    {
        // Build a string where you loop over every card and append the card's toString() to this.  Return this string to see all 52 cards
        String returnString = ""; 

        for(Card card : cards)
        {
            returnString = " " + cards.toString() + " " ;

        }
        return returnString;
    }
}
