package src.Cards;
public class Main {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.get (deck.get(5))
        System.out.println = ("suit: %s, name: %s, value: %d\n",
        card.getSuit(), card.getname(), card.getValue());

        System.out.println(card);
        System.out.println(deck);
    }
}
