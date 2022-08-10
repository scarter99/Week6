package WarGame1;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> hand;
    private int score;

    // Default Constructor
     
    public Player() {
        this.name = "";
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    // @param name of player
     
    public Player(String name) {
        this.score = 0;
        this.name = name;
        this.hand = new ArrayList<>();
    }

    // @return name of player
     
    public String getName() {
        return name;
    }

    // @return score of player
    
    public int getScore() {
        return score;
    }

    // print info about player
     
    public void describe() {
        String playerInfo = this.name + "'s score: " + this.score + "\r\nCurrent hand:\r\n";
        System.out.print(playerInfo);
    }

    // @return card at index 0 of player hand
    
    public Card flip() {
       return hand.remove(0);
    }

    // @param deck to draw from
  
    public void draw(Deck deck) {
        hand.add(new Card(deck.draw()));
    }

    // increments score of player
   
    public void incrementScore() {
        this.score++;
    }
}
