
/**
 * Enumeration class Suit - Represents a suit from a standard playing card
 *
 * @Matthew Ford
 * @version 2021.05.19.01
 */
public enum Suit
{
    // Declare a value for Clubs, Diamonds, Hearts, and Spades
    Clubs("Clubs"), 

    Diamonds("Diamonds"), 

    Hearts("Hearts"), 

    Spades("Spades"); 

    private String suit;

    Suit(String suit)
    {
        this.suit = suit;   
    }
}
















/*
@Override
public String toString()
{
String symbol = this.name();

switch (this)
{
case Clubs:
symbol = "\u2663";
break;
case Spades:
symbol = "\u2660";
break;
case Diamonds:
symbol = "\u2666";
break;
case Hearts:
symbol = "\u2665";
break;
}

return symbol;
}
 */
