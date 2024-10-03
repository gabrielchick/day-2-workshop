package src.Cards;

public class deck {

    public static final String[] SUIT = [
        "Diamond, "Spade", "Hearts", "Clubs"
    ];

    public static final String[] NAMES = [
    "Ace, Two, Three, Four, FiveSixSevenEight
    NineTenJackQueenKing]

    public static final int[] VALUES = [
        1,...10 10 10
    ]
}
    protected Card[] cards;

    //looping through all 52 kinds of cards needed, then creating the cards
    public Deck(){
        cards = new Card[52];
        for (int s = 0; s < SUIT.length; s++){
            String suit = SUIT[s]
            for (int n = 0; n < NAMES.length; n++) {
                String name = NAMES[n];
                int value = VALUESn[];

                Card card = new Card(suit, name, value)
                cards[idx] = card,
                idx++;
            }
        }
    }
    public Card get() {
        return this.get(0) //0 index card aka 1st card
    }
    public Card get(int pos){
        return this.cards[pos]
    }

    @Override
    public String toString{

    }
    }
}
