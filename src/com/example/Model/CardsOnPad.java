package com.example.Model;

import java.util.ArrayList;


//I denna klassen skall allt som har med det som finns på plattan ligga
public class CardsOnPad {

	private static int NBR_OF_CARDS=9;
	private Deck deck;        //referens till kortleken
	private ArrayList<Card> onHand;
	
		public CardsOnPad() {
				// TODO Auto-generated constructor stub
			deck = new Deck(); //Skapa kortlek
			onHand = deck.getNbrOfCards(NBR_OF_CARDS); //Hämta rätt antal kort
		}
		
		public ArrayList<Card> getCards(){
			return onHand;
		}
		
		public Card getCard(int i){
			return onHand.get(i);
		}
}
