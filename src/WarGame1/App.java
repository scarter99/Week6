package WarGame1;

public class App {
	public static void main(String[] args) {
        Player player1 = new Player("Dan");
        Player player2 = new Player("Wally");
        Deck deck = new Deck();
        deck.shuffle();

        //draw from deck, alternate between iteration
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        //run simulation
        for (int i = 0; i < 26; i++) {
            Card p1DrawCard = new Card(player1.flip());
            Card p2DrawCard = new Card(player2.flip());

            p1DrawCard.describe();
            System.out.print(" vs ");
            p2DrawCard.describe();

            if (p1DrawCard.getValue() > p2DrawCard.getValue()) {
                System.out.println(" - " + player1.getName() + " wins the flip");
                player1.incrementScore();
            } else if (p2DrawCard.getValue() > p1DrawCard.getValue()) {
                System.out.println(" - " + player2.getName() + " wins the flip");
                player2.incrementScore();
            } else {
                System.out.println(" - This flip is a Draw");
            }

            System.out.print("\r\n");
        }

        //print final scores
        System.out.println("FINAL SCORE: ");
        System.out.println("Player 1 - " + player1.getName() + " - score of " + player1.getScore());
        System.out.println("Player 2 - " + player2.getName() + " - score of " + player2.getScore());
        
        if (player1.getScore() > player2.getScore()) {
        	System.out.println("The winner is " + player1.getName());
        } else if (player1.getScore() < player2.getScore()) {
        	System.out.println("The winner is " + player2.getName());
        } else {
        	System.out.println("The game is a draw");
        }
        
        
	}
}