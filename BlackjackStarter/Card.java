import java.util.Comparator;

/**
 * Card represents a standard playing card from a 52 card deck
 *
 * @author Charles Almond
 * @version 2020.06.18.04
 */
public class Card
{
    // private instance variables - Declare a suit (Suit), value (int), visible (boolean), and name (String)
    private Suit suit;
    private int value;
    private boolean visible;
    private String name;

    /**
     * Constructor for objects of class Card 
     * @param suit The suit of the card (Clubs, Spades, Diamonds, Hearts)
     * @param value The point value of the card, between 1 and 11, inclusive
     * @param visible The setting to show or hide the card when dealt, change with show() or hide()
     * @param name The name of the card
     */
    public Card(Suit suit, int value, boolean visible, String name) 
    {
        // Assign properties, and ensure the value is between 2 and 11, inclusive.  
        this.suit = suit;
        this.visible = visible;
        this.name = name;

        //test to ensure value is between 2-11
        if(value > 11 || value < 2)
        {
            System.out.println("Please enter values between 2 and 11."); 
        }
        else
        {
            this.value = value;
        }

    }

    /**
     * Get the card's suit
     * @return The card's suit
     */
    public Suit getSuit()
    {
        return suit;
    }

    /**
     * Get the card's point value
     * @return A number 2 - 11 of the card's point value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Get the card's name
     * @return The name of the card ("2 - 10, Jack, Queen, King, or Ace")
     */
    public String getName()
    {
        return name;
    }

    /**
     * Report if the card is facec-up or face-down
     * @return true if the card is face-up, false if face-down
     */
    public boolean isVisible()
    {
        return visible;
    }

    /**
     * Set the card as visible, so the front of the card is shown
     */
    public void show()
    {
        visible = true;
    }

    /**
     * Set the card as hidden, so the back of the card is shown
     */
    public void hide()
    {
        visible = false;
    }

    /*
     * Display the front or back of the card, based on the visible field's value
     */
    @Override
    public String toString()
    {
        // If the card is visible, display the card's name of suit (ex: Queen of Spades)
        // If the card is not visible, return the string literal "Hidden Card"
        String card;
        if(isVisible() == false) 
        {
            card = "Hidden Card";
        }
        else
        {
            card = getName() + " of " + getSuit();
        }
        return card;

    }

}
