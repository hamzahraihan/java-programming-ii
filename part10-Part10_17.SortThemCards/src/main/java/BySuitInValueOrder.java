/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        int comparator = card1.getSuit().ordinal() - card2.getSuit().ordinal();
        
        if(comparator ==0){
            return card1.getValue() - card2.getValue();
        }
        return comparator;
    }
}
