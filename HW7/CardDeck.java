public class CardDeck {

    private Card[] deck;
    private int card_count;
    
    public Card newCard() {
        int index = (int)(Math.random() * card_count);
        Card card_to_deal = deck[index];
        
        for (int i = index + 1; i < card_count; i++) {
        	deck[i-1] = deck[i];
        }
        
        card_count = card_count - 1;
        
        return card_to_deal;
    }

}