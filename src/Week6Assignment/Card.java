package Week6Assignment;

import java.util.*;

public class Card {
	

	int value;
	String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) { 
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
	
	//print card info
	public void describe() {
		StringBuilder cardName = new StringBuilder();
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
