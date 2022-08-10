package WarGame1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    // allocates cards in deck
     
    public Deck() {
        cards = new ArrayList<>();
        String[] suit = {"Clubs", "Hearts", "Diamonds", "Spades"};
        for (String s : suit) {
            for (int j = 2; j < 15; j++) {
                cards.add(new Card(j, s));
            }
        }
    }

    // shuffles list of cards
    
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Removes card at index 0 of Deck
    // @return card at index 0 of Deck
     
    public Card draw() {
       return this.cards.remove(0);
    }
}
