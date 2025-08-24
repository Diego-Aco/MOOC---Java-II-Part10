import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    public int compare(Card c1, Card c2) {
        //sort by suit first
        if (c1.getSuit()!=c2.getSuit()) {
            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        //if suits are same, then sort by values within the same suit
        } else {
            return c1.getValue()-c2.getValue();
        }
    }
}
