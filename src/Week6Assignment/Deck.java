package Week6Assignment;

import java.util.*;

public class Deck {
	
	public List<Card> cards = new ArrayList<Card>(); 

	public Deck() {	
		String[] suit = {"Clubs", "Hearts", "Spades", "Diamonds"};
		for (String s : suit) {
			for (int i = 2; i < 15; i++) {
				cards.add(new Card(i, s));
			}
		}
	}
			
	public void shuffle() {
		Collections.shuffle(cards);	
	}
	
	public Card draw() {
		return cards.remove(0);
	}

}
