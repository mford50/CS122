import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTest.
 *
 * @author  Charles Almond
 * @version 2020.06.15.01
 */
public class DeckTest
{
    /**
     * Default constructor for test class DeckTest
     */
    public DeckTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void deckConstructorTest()
    {
        // Arrange
        Deck deck = new Deck();

        // Act
        
        // Assert
        assertTrue(deck.cardsLeftInDeck() == 52);
    }
    
    @Test
    public void deckDealTest()
    {
        // Arrange
        Deck deck = new Deck();

        // Act
        Card c1 = deck.deal();
        // Assert
        assertTrue(c1 instanceof Card);
    }
    
    @Test
    public void deckShuffleTest()
    {
        // Arrange
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        boolean cardsEqual = true;
        
        // Act
        for (int i = 0; i < 52; i++)
        {
            Card c1 = deck1.deal();
            Card c2 = deck2.deal();
            // Use the getters of c1 and c2 to compare fields.  If one field isn't the same, set cardsEqual to false
            if (c1.getValue() != c2.getValue() 
             || c1.getSuit() != c2.getSuit()
             || !c1.getName().equals(c2.getName()))
            {
                cardsEqual = false;
            }
            
            if (cardsEqual == false)
            {
                break;
            }
        }
        
        // Assert
        assertFalse(cardsEqual);
    }
    
    @Test
    public void cardValueTest()
    {
        // Arrange
        Deck deck = new Deck();
        Card card = deck.deal();
        Card ace = null;
        Card king = null;
        Card queen = null;
        Card jack = null;
        Card ten = null;
        Card nine = null;
        
        
        for (int i = 0; i < 51; i++)
        {
            card = deck.deal();
            
            if (card.getName().equalsIgnoreCase("ace"))
            {
                ace = card;
            }
            else if (card.getName().equalsIgnoreCase("king"))
            {
                king = card;
            }            
            else if (card.getName().equalsIgnoreCase("queen"))
            {
                queen = card;
            }
            else if (card.getName().equalsIgnoreCase("queen"))
            {
                queen = card;
            }
            else if (card.getName().equalsIgnoreCase("jack"))
            {
                jack = card;
            }
            else if (card.getName().equalsIgnoreCase("10"))
            {
                ten = card;
            }
            else if (card.getName().equalsIgnoreCase("9"))
            {
                nine = card;
            }
        }
        
        // Assert
        assertEquals(ace.getValue(), 11);
        assertEquals(king.getValue(), 10);
        assertEquals(queen.getValue(), 10);
        assertEquals(jack.getValue(), 10);
        assertEquals(ten.getValue(), 10);
        assertEquals(nine.getValue(), 9);
    }
}
