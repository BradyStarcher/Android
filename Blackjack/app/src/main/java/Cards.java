/**
 * Created by brady on 3/3/2018.
 */

public class Cards
{
    public Suits suit;
    public int value;

    public Cards(Suits newSuit, int newValue)
    {
        suit = newSuit;
        value = newValue;
    }

    public Suits getSuit()
    {
        return suit;
    }

    public int getValue()
    {
        return value;
    }

    public String suitNames()
    {
        switch (suit)
        {
            case Hearts:
                return "Hearts";
            case Diamonds:
                return "Diamonds";
            case Clubs:
                return "Clubs";
            case Spades:
                return "Spades";
            default:
                return "Card";
        }
    }

    public String valueNames()
    {
        switch (value)
        {
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Card";
        }
    }

    public String cardName()
    {
        return valueNames() + " of " + suitNames();
    }
}
