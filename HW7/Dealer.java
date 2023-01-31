public class Dealer {
	
	CardDeck deck;
	
	public Dealer() {
        deck = new CardDeck();
    }

    public void dealTo(CardPlayerBehavior p) {
        while (p.wantsACard()) {
            p.receiveCard(deck.newCard());
        }
    }
    
    public void dealOneTo(CardPlayerBehavior p) {
    	p.receiveCard(deck.newCard());
    }

}
