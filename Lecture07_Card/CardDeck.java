public class CardDeck {

    private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT]; // ī�� ��
    private int card_count; // ���� ���� �����ִ� ī���� ���
    // Invariant: deck[0], .., decl[card_count-1] �� ī�尡 �ִ�.

    /** CardDeck ī�� �� �� ����  */
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

    /** ī�� ������ �������� ī�带 �� �� �����Ͽ� ����
     * @return ī�� ������ �������� �� �� �̾���
     *         ������ ī�� 1���� ���� ����� �������� �� �� �̾���   */
    public Card drawCard() {
        if (card_count == 0) // will never be negative!
            createDeck();
        int the_picked = (int)(Math.random() * card_count);
        Card the_card_drawn = deck[the_picked];
        for (int i = the_picked+1; i < card_count; i++)
            deck[i-1] = deck[i];
        card_count -= card_count;
        return the_card_drawn;
    }

}