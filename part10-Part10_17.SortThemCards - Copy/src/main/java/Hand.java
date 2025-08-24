import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print(){
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void sort(){
        this.cards = cards.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public int compareTo(Hand otherHand) {
        int thisSum = this.cards.stream().mapToInt(card -> card.getValue()).sum();
        int otherSum = otherHand.cards.stream().mapToInt(card -> card.getValue()).sum();
        return thisSum - otherSum;
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
