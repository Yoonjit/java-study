public class CardDeck {

    private int card_count; // 남은 카드 수
    private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
    // Invariant: deck[0], .., deck[card_count-1] 에 카드가 있다.

    public CardDeck() {
        createDeck();
    }

    private void createDeck() {
        createSuit(Card.SPADES);
        createSuit(Card.HEARTS);
        createSuit(Card.CLUBS);
        createSuit(Card.DIAMONDS);
    }

    private void createSuit(String which_suit) {
        for(int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i++) {
            deck[card_count] = new Card(which_suit, i);
            card_count = card_count + 1;
        }
    }

    /** newCard - 임의의 새 카드 한 장을 뽑아 줌
    * @return 카드 덱에서 임의로 한 장을 뽑아 리턴
    *         없으면 카드 1벌을 새로 만들고 한 장을 뽑아 리턴   */
    public Card newCard() {
        if (! this.moreCards())
            createDeck();
        int index = (int)(Math.random() * card_count);
        Card card_to_deal = deck[index];
        for (int i = index+1; i < card_count; i++)
            deck[i-1] = deck[i];
        card_count = card_count - 1;
        return card_to_deal;
    }

    /** moreCards - 카드 덱에 카드가 남아있는지 알려줌  
     * @return 있으면 true, 없으면 false */
    public boolean moreCards() {
        return card_count > 0;
    }

}