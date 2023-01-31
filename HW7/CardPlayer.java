public abstract class CardPlayer implements CardPlayerBehavior {

	private Card[] hand;
    private int card_count;
    
    public CardPlayer(int max_cards) {
        hand = new Card[max_cards];
        card_count = 0;
    }
    
    public abstract boolean wantsACard();
    
    public boolean receiveCard(Card c) {
        if (card_count < hand.length) {
            hand[card_count] = c;
            card_count += 1;
            
            return true;
        }
        else
            return false;
    }
    
    public Card[] hand() {
    	Card[] card = new Card[card_count];
        for (int i = 0; i < card_count; i++) {
        	card[i] = hand[i];
        }
        return card;
    }
    	
    
    public int totalScore() {
    	int total = card_count;
    	return total;
    	
    }
    
}
