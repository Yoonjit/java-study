public class Dealer {

    CardDeck deck;

    public Dealer() {
        deck = new CardDeck(); // 카드 덱 오브젝트를 전달받아서 기억
    }

    public void dealTo(CardPlayerBehavior p) {
        while (p.wantsACard()) {
            p.receiveCard(deck.newCard());
        }

    }
    
    public void dealOneTo(CardPlayerBehavior p) {
    	p.receiveCard(deck.newCard());
    }
    

//    public static void main(String[] args) {
//        Dealer d = new Dealer();
//        HumanPlayer p = new HumanPlayer(3);
//        d.dealTo(p);
//        Card[] hand = p.showCards();
//        for (int i = 0; i < hand.length; i++) {
//            System.out.println(hand[i].getSuit() + " " + hand[i].getRank());
//        }
//    }
    
}