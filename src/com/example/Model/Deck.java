package com.example.Model;

import com.example.gridtest.R;
import java.util.ArrayList;

import android.util.Log;

//Class that handles a deck of cards
public class Deck {
	private ArrayList<Card> myDeck;
	public Deck() {
		//Create the Deck
		myDeck = new ArrayList<Card>();
		//Detta blir ju lite lång lista men så länge funkar det.
		//myDeck = new ArrayList<Card>();
		Card c = new Card(R.drawable.lion,R.drawable.lion_red,Card.CardType.FILLED);
		myDeck.add(c);
		myDeck.add(new Card(R.drawable.lion,R.drawable.lion_red,Card.CardType.HOLLOW));
		myDeck.add(new Card(R.drawable.ape,R.drawable.ape_red,Card.CardType.HOLLOW));
		myDeck.add(new Card(R.drawable.seal,R.drawable.seal_red,Card.CardType.HOLLOW));
		//OSV för alla kort
	}
	
	public void shuffle(){
		//Shuffle the cards
	}
	
	public ArrayList<Card> getNbrOfCards(int nbr){
		//Här bör man ta bort korten från listan så att de inte ligger kvar
		//Jag tar ut två kort o returnerar
		ArrayList<Card> c = new ArrayList<Card>();
		c.add(myDeck.get(0));
		c.add(myDeck.get(1));
		//Ta bort dem från ursprungliga
		myDeck.remove(0);
		myDeck.remove(1);
		return c;
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		Log.i("Mark","Info om deck");
		//osv
	}
	
	public String getInfo() {
		// TODO Auto-generated method stub
		return "A lot of info om leken alla kort etc etc";
	}
	
}

