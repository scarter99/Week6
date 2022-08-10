package Week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	String name;
	int score;
	List<Card> hand;
	
	public Player(String name) {
		score = 0;
		this.setName(name);
		this.hand = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void describe() {
		System.out.println("Player Info: ");
	//	System.out.println(playerOne.getName);
	}
	

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public int getScore() {
		return score;
	}
	
	public void incrementScore() {
		this.score++;
	}
}
