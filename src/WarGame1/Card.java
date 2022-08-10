package WarGame1;

public class Card {
	 private int value;
	    private String name;

	    public Card(int value, String name) {
	        this.value = value;
	        this.name = name;
	    }

	    public Card(Card card) {
	        this.value = card.getValue();
	        this.name = card.getName();
	    }

	    
	    // @return value of card
	     
	    public int getValue() {
	        return value;
	    }

	    // @param value of card
	    
	    public void setValue(int value) {
	        this.value = value;
	    }

	    // @return name of card
	     
	    public String getName() {
	        return name;
	    }

	    // @param name of card
	     
	    public void setName(String name) {
	        this.name = name;
	    }

	    // print info about card
	    
	    public void describe() {
	        StringBuilder cardName = new StringBuilder();
	        //only used for cards with names
	        if (this.value > 10) {
	            switch (this.value) {
	                case 11:
	                    cardName.append("Jack");
	                    break;

	                case 12:
	                    cardName.append("Queen");
	                    break;

	                case 13:
	                    cardName.append("King");
	                    break;

	                case 14:
	                    cardName.append("Ace");
	                    break;
	            }
	        } else {
	            cardName.append(this.value);
	        }
	        cardName.append(" of ").append(this.name);
	        System.out.print(cardName);
	    }
}
