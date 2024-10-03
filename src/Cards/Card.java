package src.Cards;

public class Card {
    
    //Members of the class (final = cannot change, so we only initialise once either here or the constructor)
    private final String name;
    private final String suit;
    private final int value;

     //Constructor (you cannot create a blank card. i.e. every must have a suit,value,name)
    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }
  
    public String getName() {return name;}
    public String getSuit() {return suit;}
    public int getValue() {return value;}

    @Override
    public String toString(){
        return "Card(suit: %s, name,)
    }
}















//Things needed for workshop
//1) draw cards

//create a list of cards
//create decks
//use the stack function  for last in first out


//2) shuffle cards