import java.util.ArrayList;
import java.util.Collections;

/**
 * A class to represent a deck of cards
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    // Declare a private ArrayList of cards
    
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
        
    }
    
    /**
     * Deal a card from the deck
     * @return A Card from the deck
     */
    public Card deal()
    {
        // Call the remove method on the cards ArrayList, always using index number 0, and return this card
    }

    /**
     * Report on the size of the remaining cards in the deck
     * @return The number of cards left in the deck
     */
    public int cardsLeftInDeck()
    {
        // Return the size of the cards collection
    }
    
    /*
     * Returns 52 pick-up
     */
    @Override
    public String toString()
    {
        // Build a string where you loop over every card and append the card's toString() to this.  Return this string to see all 52 cards
    }
}
