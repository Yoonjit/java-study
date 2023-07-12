
public class Dealer {
	
	CardDeck deck;
	
	public Dealer() {
		deck = new CardDeck();
	}
	
	public void dealTo(CardPlayerBehavior p) {
		while (p.wantsACard()) {
			Card c = deck.newCard();
			p.receiveCard(c);
		}
	}
	
	public void dealOneTo(CardPlayerBehavior p) {
		Card c = deck.newCard();
		p.receiveCard(c);
	}

	
//	public static void main(String[] args) {
//		Dealer d = new Dealer();
//		HumanPlayer p = new HumanPlayer(3);
//		d.dealTo(p);
//		Card[] hand = p.showCards();
//		for (int i = 0; i < hand.length; i++) {
//			System.out.println(hand[i].getSuit() + " " + hand[i].getRank());
//		}
//	}
}
