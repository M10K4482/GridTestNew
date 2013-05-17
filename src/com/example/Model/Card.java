package com.example.Model;

public class Card {
	//F�rdelen med detta �r att man bara kan av�nda dessa orden s� att det inte kan bli missf�rst�nd. L�s om enum
	public static enum CardType{FILLED,HOLLOW,STRIPES};
	//Gissar att ni beh�ver fler enum h�r s� att ni sen kan j�mf�ra och hitta set
	
	private int cardPressed; //Spara R.id v�rdet f�r bildena i desssa 
	private int cardNormal;
	private CardType type; //h�r s�ger vi att vi bara accepterar v�ra typer
    private boolean isPressed;
    
	/**skapar ett kort d�r man sparar de bilder eller r.id.xx f�r bilderna samt typen av bild*/
	public Card(int cardPressed, int cardNormal,CardType type) {
		// TODO Auto-generated constructor stub
		//lagra i privata instansvariabler
		this.cardNormal = cardNormal;
		this.cardPressed = cardPressed;
	}

	public int getCardImage() {
		int cardImage = cardNormal;
		if (isPressed){
			cardImage = cardPressed;
		}
		return cardImage;
	}
	public CardType getCardType() {
		return type;
	}
	
	public void pressCard(){
		isPressed =! isPressed; //Byter true till false och omv�nt 
	}

	public boolean isPressed(){
		return isPressed;
	}

	//Plus fler metoder
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Skriv info om korten";
	}
}
