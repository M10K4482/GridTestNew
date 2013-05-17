package com.example.Model;

import java.util.ArrayList;


//I denna klassen skall allt som har med det som finns p� plattan ligga
public class CardsOnPad {

	private static int NBR_OF_CARDS=9;
	private Deck deck;        //referens till kortleken
	private ArrayList<Card> onHand;
	
		public CardsOnPad() {
				// TODO Auto-generated constructor stub
			deck = new Deck(); //Skapa kortlek
			onHand = deck.getNbrOfCards(NBR_OF_CARDS); //H�mta r�tt antal kort
		}
		
		public ArrayList<Card> getCards(){
			return onHand;
		}
		
		public Card getCard(int i){
			return onHand.get(i);
		}
}
