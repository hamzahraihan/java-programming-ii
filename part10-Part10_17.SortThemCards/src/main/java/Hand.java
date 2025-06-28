/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.*;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        Iterator<Card> iter = this.cards.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void sort() {
//        Comparator<Card> comparator = Comparator.comparing(Card::getValue)
//                .thenComparing(Card::getSuit);
        Collections.sort(this.cards);
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    public int totalValue() {
        return this.getCards()
                .stream()
                .map(value -> value.getValue())
                .reduce(0, (accum, combiner) -> accum + combiner);
    }

    @Override
    public int compareTo(Hand another) {
        return this.totalValue() - another.totalValue() ;
    }
}
