package Week6Assignment;

import java.util.List;

public class App {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player playerOne = new Player("Dan");
		Player playerTwo = new Player("Wally");
		
		//draw from deck for each player through all 52 cards
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				playerOne.draw(deck);
			}
			else
			{
				playerTwo.draw(deck);
			}
				
		}
		
		//play the game & keep score
		Card cardOne;
		int valueOne;
		
		Card cardTwo;
		int valueTwo;
		for (int i = 0; i< 26; i++) {
			cardOne = playerOne.flip();
			cardTwo = playerTwo.flip();
			valueOne = cardOne.getValue();
			valueTwo = cardTwo.getValue();
			if(valueOne > valueTwo) {
				playerOne.incrementScore();
			}
		    else {
			    playerTwo.incrementScore();
		    }
	    }
		
		//announce scores and winner
		if(playerOne.getScore()> playerTwo.getScore()) {
			System.out.println("The winner is " + playerOne.getName() + ", Player One");
			System.out.println(playerOne.getName() + " - Player One - Score: " + playerOne.getScore());
			System.out.println(playerTwo.getName() + " - Player Two - Score: " + playerTwo.getScore());
			
		}
		else if(playerOne.getScore()< playerTwo.getScore()) {
			System.out.println("The winner is " + playerTwo.getName() + ", Player Two");
			System.out.println(playerOne.getName() + " - Player One - Score: " + playerOne.getScore());
			System.out.println(playerTwo.getName() + " - Player Two - Score: " + playerTwo.getScore());
		}
		else
		{
			System.out.println("The game is a draw");
			System.out.println(playerOne.getName() + " - Player One - Score: " + playerOne.getScore());
			System.out.println(playerTwo.getName() + " - Player Two - Score: " + playerTwo.getScore());
		}
			

}
}
