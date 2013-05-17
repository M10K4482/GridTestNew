package com.example.Model;

public class Card {
	//Fördelen med detta är att man bara kan avända dessa orden så att det inte kan bli missförstånd. Läs om enum
	public static enum CardType{FILLED,HOLLOW,STRIPES};
	//Gissar att ni behöver fler enum här så att ni sen kan jämföra och hitta set
	
	private int cardPressed; //Spara R.id värdet för bildena i desssa 
	private int cardNormal;
	private CardType type; //här säger vi att vi bara accepterar våra typer
    private boolean isPressed;
    
	/**skapar ett kort där man sparar de bilder eller r.id.xx för bilderna samt typen av bild*/
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
		isPressed =! isPressed; //Byter true till false och omvänt 
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
